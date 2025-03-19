// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.kotlin.compose) apply false
    // Hilt
    id("com.google.dagger.hilt.android") version "2.52" apply false
    // kotlinx serialization
    kotlin("jvm") version "2.1.0" // or kotlin("multiplatform") or any other kotlin plugin
    kotlin("plugin.serialization") version "2.1.0"
}