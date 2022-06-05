package projects.keheira.sdkexample

import android.os.Build
import android.os.Build.VERSION
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import projects.keheira.basicinfolib.BasicInfo
import projects.keheira.sdkexample.ui.theme.SDKExampleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SDKExampleTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting("Basic Info sdk details")
                }
            }
        }
    }
}

@Composable
fun Greeting(info: String) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = info)
        Spacer(modifier = Modifier.height(15.dp))

        Text(text = "Your app details are ${BasicInfo.getBuildDetails(BuildConfig.VERSION_NAME, BuildConfig.VERSION_CODE)}")
        Spacer(modifier = Modifier.height(15.dp))

        Text(text = "The creator is ${BasicInfo.getDeveloper()}")
        Spacer(modifier = Modifier.height(15.dp))

        Text(text = "The default reason is ${BasicInfo.getReason()}")
        Spacer(modifier = Modifier.height(15.dp))

        Text(text = "The custom reason is ${BasicInfo.getReason("this was fun")}")
        Spacer(modifier = Modifier.height(15.dp))
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    SDKExampleTheme {
        Greeting("Android")
    }
}