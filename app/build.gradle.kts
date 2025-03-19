plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.compose)
    // Kotlin kapt
    id("kotlin-kapt")
    //Hilt
    id("com.google.dagger.hilt.android")
}

android {
    namespace = "com.example.grocery"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.grocery"
        minSdk = 24
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        debug {
            buildConfigField("Boolean", "DEBUG", "true")
        }
        release {
            isMinifyEnabled = false
            buildConfigField("Boolean", "DEBUG", "false")
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
    buildFeatures {
        compose = true
        buildConfig = true // Enable BuildConfig generation
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)

    // Hilt
    implementation(libs.hilt.android)
    // Kotlin kapt
    kapt(libs.hilt.android.compiler)

    // retrofit
    implementation(libs.retrofit)

    // kotlinx serialization
    implementation(libs.kotlinx.serialization.json)

    // coroutines
    implementation(libs.kotlinx.coroutines.android)

    // Jetpack Compose integration
    implementation(libs.androidx.navigation.compose)

    // Testing Navigation
    androidTestImplementation(libs.androidx.navigation.testing)

    // datastore
    implementation(libs.androidx.datastore.preferences)

    // Timber
    implementation(libs.timber)
}

kapt {
    correctErrorTypes = true
}