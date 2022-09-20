package projects.keheira.retrofitexample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import projects.keheira.retrofitexample.ui.theme.RetrofitExampleTheme
import kotlin.random.Random

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RetrofitExampleTheme {
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
fun Main() {
    val mainVM: MainViewModel = viewModel()

    Scaffold(
        topBar = {
            TopAppBar() {
                Text(
                    text = "Welcome to the Start Wars People Generator!",
                    modifier = Modifier.fillMaxWidth(),
                    textAlign = TextAlign.Center
                )
            }
        },
        content = {
            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = "if you watched this stream sorry for old libs. Didn't want to fight with Google.",
                    fontSize = 20.sp,
                    modifier = Modifier.fillMaxWidth().padding(10.dp),
                    textAlign = TextAlign.Center
                )
                Spacer(modifier = Modifier.height(20.dp))
                OutlinedButton(
                    onClick = {
                        val randomValue =  Random.nextInt(0, 10)
                        mainVM.getPerson(randomValue)
                    }
                ) {
                    Text(text = "Generate New Details")
                }
                Spacer(modifier = Modifier.height(30.dp))
                Text(text = mainVM.details)
            }
        }
    )
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    RetrofitExampleTheme {
        Main()
    }
}