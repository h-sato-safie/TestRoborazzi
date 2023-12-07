package com.example.android.template.testroborazzi

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun SampleText() {
    val size = 50.sp
    val spaceHeight = 90.dp
    Column {
        Spacer(modifier = Modifier.height(spaceHeight))
        Text(text = "Hallo World!", fontSize = size)
        Spacer(modifier = Modifier.height(spaceHeight))
        Text(text = "ABCDE12345AA", fontSize = size)
        Spacer(modifier = Modifier.height(spaceHeight))
    }
}

@Preview(showBackground = true)
@Composable
private fun SampleTextPreview() {
    SampleText()
}