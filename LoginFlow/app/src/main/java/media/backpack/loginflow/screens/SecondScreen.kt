package media.backpack.loginflow.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun Secondary(navController: NavController){
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Ths is the second app screen")
        Spacer(modifier = Modifier.height(30.dp))
        TextButton(
            onClick = { navController.navigate("main") {
                popUpTo("main")
            } },
            border = BorderStroke(width = 5.dp, color = Color.Green)
        ) {
            Text(text = "Go back home")
        }
    }
}