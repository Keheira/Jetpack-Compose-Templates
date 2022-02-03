package media.backpack.splashscreen

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
sealed class SplashNavigationScreens(val route: String) {
    object Splash : SplashNavigationScreens("splash")
    object Main : SplashNavigationScreens("main")
}

@Composable
fun SplashNavigation(navController: NavHostController) {
    NavHost(navController = navController, startDestination = SplashNavigationScreens.Splash.route){
        composable(SplashNavigationScreens.Splash.route) { SplashScreen(navController = navController) }
        composable(SplashNavigationScreens.Main.route) { WelcomeScreen()}
    }
}