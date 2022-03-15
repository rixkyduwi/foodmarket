package rizkydwisaputra.id.muslimcoder.makananpantura.model.response.login

data class User {
    @Expose
    Serialization("address")
    val address: String
}