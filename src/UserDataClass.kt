import com.google.gson.annotations.SerializedName

data class UserDataClass(
    @SerializedName("name") val username:String?,
    @SerializedName("age") val userAge:Int?,
    @SerializedName("Gender") val userGender:String?,
    @SerializedName("Profession") val userProfession:String?,
    @SerializedName("Business") val userBusiness :String?
)