package media.backpack.loginflow.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import media.backpack.loginflow.screens.Home
import media.backpack.loginflow.screens.Secondary


sealed class StartupNavigationScreens(val route: String) {
    object Login : StartupNavigationScreens("login")
    object Register : StartupNavigationScreens("register")
    object Main : StartupNavigationScreens("main")
}

sealed class MainNavigationScreens(val route: String) {
    object Home : MainNavigationScreens("home")
    object Secondary : MainNavigationScreens("second")
}

fun NavGraphBuilder.mainGraph(navController: NavController) {
    navigation(startDestination = MainNavigationScreens.Home.route, route = StartupNavigationScreens.Main.route) {
        composable(MainNavigationScreens.Home.route) { Home(navController) }
        composable(MainNavigationScreens.Secondary.route) { Secondary(navController) }
    }
}