package rizkydwisaputra.id.muslimcoder.makananpantura.ui.auth.signin

import rizkydwisaputra.id.muslimcoder.makananpantura.base.basepresenter
import rizkydwisaputra.id.muslimcoder.makananpantura.base.baseview
import rizkydwisaputra.id.muslimcoder.makananpantura.model.response.login.LoginResponse

interface SignInContract {
    interface View:baseview{
        fun onLoginSuccess(loginResponse: LoginResponse)
        fun onLoginFailes(message:String)

    }
    interface Presenter: SignInContract ,basepresenter

}