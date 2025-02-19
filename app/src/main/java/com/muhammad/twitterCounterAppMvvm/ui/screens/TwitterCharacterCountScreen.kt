package com.muhammad.twitterCounterAppMvvm.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.muhammad.twitterCounterAppMvvm.R
import com.muhammad.twitterCounterAppMvvm.ui.TweetViewModel

@Composable
fun TweetScreen(viewModel: TweetViewModel) {
    val charCount by viewModel.charCount.collectAsState()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Twitter character count",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            color = Color(android.graphics.Color.parseColor("#000000"))
        )

        Spacer(modifier = Modifier.height(8.dp))

        Image(
            painter = painterResource(id = R.drawable.twitter_icon),
            contentDescription = "Twitter Icon",
            modifier = Modifier.size(64.dp)
        )

        Spacer(modifier = Modifier.height(16.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            StatBox(title = "Characters Typed", value = "$charCount/280")
            StatBox(title = "Characters Remaining", value = "${280 - charCount}")
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Text Field
        TweetTextField(
            viewModel = viewModel,
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(16.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Button(
                onClick = { /* Copy Text */ },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(
                        android.graphics.Color.parseColor(
                            "#00A970"
                        )
                    )
                )

            ) {
                Text(text = "Copy Text", color = Color.White)
            }

            Button(
                onClick = { viewModel.onTweetTextChanged("") },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(
                        android.graphics.Color.parseColor(
                            "#DC0125"
                        )
                    )
                ) // Red
            ) {
                Text(text = "Clear Text", color = Color.White)
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = { viewModel.postTweet() },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(
                    android.graphics.Color.parseColor(
                        "#03A9F4"
                    )
                )
            ), // Twitter Blue
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "Post tweet", color = Color.White)
        }
    }
}

@Composable
fun StatBox(title: String, value: String) {
    Column(
        modifier = Modifier
            .background(
                Color(android.graphics.Color.parseColor("#E0F7FA")),
                shape = RoundedCornerShape(8.dp)
            )
            .padding(16.dp)
    ) {
        Text(text = title, fontSize = 14.sp, color = Color.Gray)
        Text(text = value, fontSize = 20.sp, fontWeight = FontWeight.Bold, color = Color.Black)
    }
}

@Composable
fun TweetTextField(
    viewModel: TweetViewModel,
    modifier: Modifier = Modifier
) {
    val maxCharacterLimit = 280
    val maxLines = 5
    val tweetText by viewModel.tweetText.collectAsState()

    OutlinedTextField(
        value = tweetText,
        onValueChange = { newText ->
            if (newText.length <= maxCharacterLimit) {
                viewModel.onTweetTextChanged(newText)
            }
        },
        placeholder = { Text("Start typing! You can enter up to $maxCharacterLimit characters") },
        modifier = modifier
            .fillMaxWidth()
            .height(150.dp),
        maxLines = maxLines,
        keyboardOptions = KeyboardOptions(
            keyboardType = KeyboardType.Text,
            imeAction = ImeAction.Done
        ),
        supportingText = {
            Text(text = "${tweetText.length}/$maxCharacterLimit")
        },
        isError = tweetText.length > maxCharacterLimit
    )
}