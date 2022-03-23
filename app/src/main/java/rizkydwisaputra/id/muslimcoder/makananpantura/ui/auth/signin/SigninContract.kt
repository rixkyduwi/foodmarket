package rizkydwisaputra.id.muslimcoder.makananpantura.ui.auth.signin

import rizkydwisaputra.id.muslimcoder.makananpantura.base.BasePresenter
import rizkydwisaputra.id.muslimcoder.makananpantura.base.BaseView
import rizkydwisaputra.id.muslimcoder.makananpantura.model.response.login.LoginResponse

interface SigninContract {
    interface View:BaseView{
        fun onLoginSuccess(loginResponse: LoginResponse)
        fun onLoginFailes(message:String)

    }
    interface Presenter: SigninContract ,BasePresenter

}
