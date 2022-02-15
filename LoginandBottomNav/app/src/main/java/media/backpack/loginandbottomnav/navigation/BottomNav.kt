package media.backpack.loginandbottomnav.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import media.backpack.loginandbottomnav.R
import media.backpack.loginandbottomnav.view.*

sealed class BottomNavigationScreens(val route: String, val label: String, val icon: Int) {
    object Item1 : BottomNavigationScreens("item1", "Item1", R.drawable.ic_baseline_all_inclusive_24)
    object Item2 : BottomNavigationScreens("item2", "Item2", R.drawable.ic_baseline_all_inclusive_24)
    object Item3 : BottomNavigationScreens("item3", "Item3", R.drawable.ic_baseline_all_inclusive_24)
    object Item4 : BottomNavigationScreens("item4", "Item4", R.drawable.ic_baseline_all_inclusive_24)
    object Item5 : BottomNavigationScreens("item5", "Item5", R.drawable.ic_baseline_all_inclusive_24)
}

val bottomNavigationItems = listOf(
    BottomNavigationScreens.Item1,
    BottomNavigationScreens.Item2,
    BottomNavigationScreens.Item3,
    BottomNavigationScreens.Item4,
    BottomNavigationScreens.Item5
)

@Composable
fun MainNavHost(authController: NavController, navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = BottomNavigationScreens.Item3.route
    ) {
        composable(BottomNavigationScreens.Item1.route) { ItemOneScreen() }
        composable(BottomNavigationScreens.Item2.route) { ItemTwoScreen() }
        composable(BottomNavigationScreens.Item3.route) { ItemThreeScreen() }
        composable(BottomNavigationScreens.Item4.route) { ItemFourScreen() }
        composable(BottomNavigationScreens.Item5.route) { ItemFiveScreen() }
    }
}