package media.backpack.loginflow

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import media.backpack.loginflow.navigation.StartupNavigationScreens
import media.backpack.loginflow.navigation.mainGraph
import media.backpack.loginflow.screens.Login
import media.backpack.loginflow.screens.Register
import media.backpack.loginflow.ui.theme.LoginFlowTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LoginFlowTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Main()
                }
            }
        }
    }
}

@Composable
fun Main(){
    val navController = rememberNavController()

    NavHost(navController, startDestination = StartupNavigationScreens.Login.route) {
        composable(StartupNavigationScreens.Login.route) { Login(navController) }
        composable(StartupNavigationScreens.Register.route) { Register(navController) }
        mainGraph(navController)
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    LoginFlowTheme {
        Main()
    }
}