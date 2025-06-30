package com.example.statehoistingapp

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun CounterScreen() {
    var name by remember { mutableStateOf("") }
    var count by remember { mutableStateOf(0) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        NameInput(
            name = name,
            onNameChange = { name = it }
        )

        Spacer(modifier = Modifier.height(16.dp))

        // ✅ Show the typed name
        if (name.isNotBlank()) {
            Text(
                text = "Hello, $name!",
                style = MaterialTheme.typography.bodyLarge
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        CounterButton(
            count = count,
            onIncrement = { count++ }
        )

        Spacer(modifier = Modifier.height(26.dp))

        Button(onClick = {
            name = ""
            count = 0
        }) {
            Text("Reset")
        }
    }
}
