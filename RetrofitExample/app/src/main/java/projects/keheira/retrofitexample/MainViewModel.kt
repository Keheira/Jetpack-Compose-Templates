package projects.keheira.retrofitexample

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import java.lang.Exception

class MainViewModel: ViewModel() {
    var details: String by mutableStateOf("")

    fun getPerson(id: Int) {
        viewModelScope.launch {
            val apiService = RetrofitApi.getInstance()
            try {
                val response = apiService.getResponse(id = id)
                details = response.toString()
            } catch (e: Exception) {
                details = e.toString()
            }
        }
    }
}