package com.example.grocery.onboarding.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.grocery.R

@Composable
fun SplashScreen() {
    Box(
        modifier = Modifier.fillMaxSize().background(Color(0xFF53B175)),
        contentAlignment = Alignment.Center
    ) {
        Image(
            painter = painterResource(R.drawable.splash_logo),
            contentDescription = "Splash ScreenLogo"
        )
    }
}


@Preview
@Composable
fun SplashScreenPreview() {
    SplashScreen()
}