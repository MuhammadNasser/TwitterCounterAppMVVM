package com.muhammad.twitterCounterAppMvvm.utils

import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import android.widget.Toast
import java.util.Properties


fun copyToClipboard(context: Context, text: String) {
    if (text.isNotEmpty()) {
        val clipboard = context.getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
        val clip = ClipData.newPlainText("Copied Text", text)
        clipboard.setPrimaryClip(clip)
        Toast.makeText(context, "Copied to clipboard", Toast.LENGTH_SHORT).show()
    }
}

fun getTwitterAccessToken(context: Context): String {
    val properties = Properties()
    val inputStream = context.assets.open("secrets.properties")
    properties.load(inputStream)
    return properties.getProperty("TWITTER_ACCESS_TOKEN", "")
}