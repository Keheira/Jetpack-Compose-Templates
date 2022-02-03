package media.backpack.splashscreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import kotlinx.coroutines.delay
import media.backpack.splashscreen.ui.theme.SplashScreenTheme

@Composable
fun SplashScreen(navController: NavController){
    val scale = remember {
        androidx.compose.animation.core.Animatable(0f)
    }

    // TODO: add animation here if you want
    LaunchedEffect(key1 = true){
        delay(3000L)
        navController.navigate("main")
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(R.color.teal_200)),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_foreground),
            colorFilter = ColorFilter.tint(Color.White),
            contentDescription = "Default Logo",
            modifier = Modifier.scale(scale.value))
    }
}

@Preview(showBackground = true)
@Composable
fun SplashPreview() {
    SplashScreenTheme {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(R.color.teal_200)),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_launcher_foreground),
                colorFilter = ColorFilter.tint(Color.White),
                contentDescription = "Default Logo")
        }
    }
}