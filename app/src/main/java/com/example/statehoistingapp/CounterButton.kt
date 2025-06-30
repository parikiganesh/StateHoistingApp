package com.example.statehoistingapp

import androidx.compose.material3.*
import androidx.compose.runtime.Composable

@Composable
fun CounterButton(
    count: Int,
    onIncrement: () -> Unit
) {
    Button(onClick = onIncrement) {
        Text("Clicked $count times")
    }
}
