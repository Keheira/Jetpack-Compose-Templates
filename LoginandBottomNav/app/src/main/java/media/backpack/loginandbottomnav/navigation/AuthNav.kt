package media.backpack.loginandbottomnav.navigation

sealed class AuthNavigationScreens(val route: String) {
    object Login : AuthNavigationScreens("login")
    object Register : AuthNavigationScreens("register")
    object Main : AuthNavigationScreens("main")
}