package com.muhammad.twitterCounterAppMvvm.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import com.muhammad.twitterCounterAppMvvm.ui.screens.TweetScreen
import com.muhammad.twitterCounterAppMvvm.ui.theme.TwitterCounterAppTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    private val viewModel: TweetViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TwitterCounterAppTheme {
                TweetScreen(viewModel) {
                    finish()
                }
            }
        }
    }
}