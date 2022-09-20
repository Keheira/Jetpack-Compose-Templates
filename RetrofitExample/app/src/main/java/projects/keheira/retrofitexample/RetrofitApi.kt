package projects.keheira.retrofitexample

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

data class People(
    val name: String,
    val height: String,
    val hair_color: String,
    val skin_color: String,
    val eye_color: String,
    val birth_year: String,
    val gender: String,
    val created: String,
    val edited: String
) {
    override fun toString(): String {
        return "$name has the following details: \n" +
                "height: $height\n" +
                "hair color: $hair_color\n" +
                "skin color: $skin_color\n" +
                "eye color: $eye_color\n" +
                "birth year: $birth_year\n" +
                "gender: $gender"
    }
}

/*
Using people calls from https://swapi.dev/
 */
interface RetrofitApi {
    @GET("people/{id}/")
    suspend fun getResponse(@Path("id") id: Int) : People

    companion object {
        var apiService: RetrofitApi? = null

        fun getInstance() : RetrofitApi {
            if (apiService == null) {
                apiService = Retrofit.Builder()
                    .baseUrl("https://swapi.dev/api/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build().create(RetrofitApi::class.java)
                }
            return apiService!! // TODO: try not to use these
        }
    }
}