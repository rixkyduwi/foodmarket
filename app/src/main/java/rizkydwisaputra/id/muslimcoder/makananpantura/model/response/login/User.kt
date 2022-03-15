package rizkydwisaputra.id.muslimcoder.makananpantura.model.response.login

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class User {
    @Expose
    @SerializedName("address")
    val address: String,
    @Expose
    @SerializedName("city")
    val city: String,
    @Expose
    @SerializedName("created_at")
    val created_at: String,
    @Expose
    @SerializedName("current_team_id")
    val current_team_id: String,
    @Expose
    @SerializedName("email")
    val email: String,
    @Expose
    @SerializedName("email_verified_at")
    val email_verified_at: String,
    @Expose
    @SerializedName("profile_foto_path")
    val profile_foto_path: String,
    @Expose
    @SerializedName("profile_foto_url")
    val profile_foto_url: String,
    @Expose
    @SerializedName("phonenumber")
    val phonenumber: String,
    @Expose
    @SerializedName("rule")
    val rule: String,
    @Expose
    @SerializedName("update")
    val rule: String,

}