import retrofit2.Call
import retrofit2.http.GET

interface RestInterface {
    @GET("/api/v1/")
    fun getData():Call<UserDataClass>
}