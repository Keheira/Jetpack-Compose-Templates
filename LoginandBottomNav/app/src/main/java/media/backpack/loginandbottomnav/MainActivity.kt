package media.backpack.loginandbottomnav

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import media.backpack.loginandbottomnav.navigation.AuthNavigationScreens
import media.backpack.loginandbottomnav.ui.theme.LoginAndBottomNavTheme
import media.backpack.loginandbottomnav.view.Login
import media.backpack.loginandbottomnav.view.Register

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LoginAndBottomNavTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    val navController = rememberNavController()

                    NavHost(navController, startDestination = AuthNavigationScreens.Login.route) {
                        composable(AuthNavigationScreens.Login.route) { Login(navController) }
                        composable(AuthNavigationScreens.Register.route) { Register(navController) }
                        composable(AuthNavigationScreens.Main.route) { MainFragment(navController) }
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    LoginAndBottomNavTheme {}
}