package com.muhammad.twitterCounterAppMvvm.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val LightColorScheme = lightColorScheme(
    primary = PrimaryLight,
    secondary = SecondaryLight,
    background = BackgroundLight
)

private val DarkColorScheme = darkColorScheme(
    primary = PrimaryDark,
    secondary = SecondaryDark,
    background = BackgroundDark
)

@Composable
fun TwitterCounterAppTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) {
        DarkColorScheme
    } else {
        LightColorScheme
    }

    MaterialTheme(
        colorScheme = colors,
        typography = MaterialTheme.typography,
        shapes = MaterialTheme.shapes,
        content = content
    )
}
