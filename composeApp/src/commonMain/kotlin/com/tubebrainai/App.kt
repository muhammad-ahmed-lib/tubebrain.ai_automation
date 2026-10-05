package com.tubebrainai

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.tubebrainai.navigation.AppNavigation
import com.tubebrainai.presentation.theme.BrandDark
import com.tubebrainai.presentation.theme.TubeBrainAITheme

@Composable
fun App() {
    TubeBrainAITheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = BrandDark
        ) {
            AppNavigation()
        }
    }
}
