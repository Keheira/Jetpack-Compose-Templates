package media.backpack.loginflow.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import media.backpack.loginflow.ui.theme.LoginFlowTheme

@Composable
fun Home(navController: NavController){
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Ths is the main app screen")
        Spacer(modifier = Modifier.height(30.dp))
        TextButton(
            onClick = { navController.navigate("second") },
            border = BorderStroke(width = 5.dp, color = Color.Green)
        ) {
            Text(text = "Go to second screen")
        }
    }
}

/*
@Preview(showBackground = true)
@Composable
fun HomePreview() {
    LoginFlowTheme {
        Home()
    }
}*/