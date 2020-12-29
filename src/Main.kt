import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.io.IOException
import kotlin.coroutines.CoroutineContext


fun main(){
    println("Kotlin WOrking...")
    val BASE_URL = "http://127.0.0.1:8000"
    val retrofit = Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).build()
    val service = retrofit.create(RestInterface::class.java)

    val response = service.getData()

   response.enqueue(object :Callback<UserDataClass>,okhttp3.Callback{
       override fun onResponse(p0: Call<UserDataClass>, p1: Response<UserDataClass>) {
           println("Response received")
           println(p1.toString())
           println(p1.body())
       }

       override fun onFailure(p0: okhttp3.Call, p1: IOException) {
           println("Failure")
       }

       override fun onResponse(p0: okhttp3.Call, p1: okhttp3.Response) {
            println("Response okhttp3")
       }

       override fun onFailure(p0: Call<UserDataClass>, p1: Throwable) {
           println("Failure okhttp3")
       }

   })
}