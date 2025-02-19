package com.muhammad.twitterCounterAppMvvm.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.muhammad.twitterCounterAppMvvm.R
import com.muhammad.twitterCounterAppMvvm.core.TweetState
import com.muhammad.twitterCounterAppMvvm.ui.TweetViewModel
import com.muhammad.twitterCounterAppMvvm.ui.theme.backgroundColor
import com.muhammad.twitterCounterAppMvvm.ui.theme.borderColor
import com.muhammad.twitterCounterAppMvvm.ui.theme.clearTextColor
import com.muhammad.twitterCounterAppMvvm.ui.theme.copyTextColor
import com.muhammad.twitterCounterAppMvvm.ui.theme.placeHolderColor
import com.muhammad.twitterCounterAppMvvm.ui.theme.titleColor
import com.muhammad.twitterCounterAppMvvm.ui.theme.twitterColor
import com.muhammad.twitterCounterAppMvvm.utils.copyToClipboard

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TweetScreen(viewModel: TweetViewModel, onBackClick: () -> Unit) {
    val charCount by viewModel.charCount.collectAsState()
    val tweetText by viewModel.tweetText.collectAsState()
    val tweetStatus by viewModel.tweetStatus.collectAsState()

    val context = LocalContext.current
    val accessToken = viewModel.getSecureToken(context)

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        // Toolbar
        TopAppBar(
            title = { Text(text = "Twitter character count") },
            navigationIcon = {
                IconButton(onClick = onBackClick) {
                    Icon(imageVector = Icons.Default.ArrowBack, contentDescription = "Back")
                }
            },
            colors = TopAppBarColors(
                containerColor = Color.White,
                scrolledContainerColor = Color.White,
                navigationIconContentColor = titleColor,
                titleContentColor = titleColor,
                actionIconContentColor = titleColor
            )
        )

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {

            Spacer(modifier = Modifier.height(8.dp))

            Image(
                painter = painterResource(id = R.drawable.twitter_icon),
                contentDescription = "Twitter Icon",
                modifier = Modifier
                    .size(64.dp)
                    .align(Alignment.CenterHorizontally)
            )

            Spacer(modifier = Modifier.height(12.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                StatBox(title = "Characters Typed", value = "$charCount/280")
                StatBox(title = "Characters Remaining", value = "${280 - charCount}")
            }

            Spacer(modifier = Modifier.height(20.dp))

            // Text Field
            TweetTextField(
                viewModel = viewModel,
                modifier = Modifier.fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(20.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Button(
                    onClick = { copyToClipboard(context = context, tweetText) },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = copyTextColor
                    ),
                    modifier = Modifier
                        .wrapContentWidth(Alignment.CenterHorizontally)
                        .height(52.dp),
                    shape = RoundedCornerShape(10.dp)
                ) {
                    Text(text = "Copy Text", color = Color.White)
                }

                Button(
                    onClick = { viewModel.onTweetTextChanged("") },
                    colors = ButtonDefaults.buttonColors(containerColor = clearTextColor),
                    modifier = Modifier
                        .wrapContentWidth(Alignment.CenterHorizontally)
                        .height(52.dp),
                    shape = RoundedCornerShape(10.dp)
                ) {
                    Text(text = "Clear Text", color = Color.White)
                }
            }

            Spacer(modifier = Modifier.height(20.dp))

            Button(
                onClick = { viewModel.postTweet(accessToken, tweetText) },
                colors = ButtonDefaults.buttonColors(containerColor = twitterColor),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(56.dp),
                shape = RoundedCornerShape(8.dp)
            ) {
                Text(text = "Post tweet", color = Color.White)
            }

            when (tweetStatus) {
                is TweetState.Loading -> CircularProgressIndicator()
                is TweetState.Success -> Text("✅ Tweet posted successfully!", color = Color.Green)
                is TweetState.Error -> Text("❌ ${(tweetStatus as TweetState.Error).message}", color = Color.Red)
                is TweetState.Idle -> {}
            }
        }
    }
}

@Composable
fun StatBox(title: String, value: String) {
    Column(
        modifier = Modifier
            .background(
                backgroundColor,
                shape = RoundedCornerShape(10.dp)
            )
            .padding(horizontal = 16.dp)
    ) {
        Text(
            text = title,
            fontSize = 14.sp,
            color = Color.Black,
            modifier = Modifier
                .wrapContentWidth(Alignment.CenterHorizontally)

        )
        Text(
            text = value,
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black,
            modifier = Modifier
                .wrapContentWidth(Alignment.CenterHorizontally)
                .align(Alignment.CenterHorizontally)
                .padding(vertical = 16.dp)
        )
    }
}

@Composable
fun TweetTextField(
    viewModel: TweetViewModel,
    modifier: Modifier = Modifier
) {
    val maxCharacterLimit = 280
    val tweetText by viewModel.tweetText.collectAsState()

    OutlinedTextField(
        value = tweetText,
        onValueChange = { newText ->
            if (newText.length <= maxCharacterLimit) {
                viewModel.onTweetTextChanged(newText)
            }
        },
        placeholder = {
            Text(
                "Start typing! You can enter up to $maxCharacterLimit characters",
                color = placeHolderColor
            )
        },
        modifier = modifier
            .fillMaxWidth()
            .height(250.dp)
            .border(1.dp, borderColor, shape = RoundedCornerShape(10.dp))
            .shadow(2.dp, shape = RoundedCornerShape(10.dp)),
        shape = RoundedCornerShape(10.dp),
        keyboardOptions = KeyboardOptions(
            keyboardType = KeyboardType.Text,
            imeAction = ImeAction.Done
        ),
        isError = tweetText.length > maxCharacterLimit,
        colors = TextFieldDefaults.colors(
            focusedIndicatorColor = borderColor,
            unfocusedIndicatorColor = borderColor,
            focusedContainerColor = Color.White,
            unfocusedContainerColor = Color.White
        )
    )
}