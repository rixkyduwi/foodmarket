package rizkydwisaputra.id.muslimcoder.makananpantura.ui.auth.signup

import android.net.Uri
import rizkydwisaputra.id.muslimcoder.makananpantura.base.BasePresenter
import rizkydwisaputra.id.muslimcoder.makananpantura.base.BaseView
import rizkydwisaputra.id.muslimcoder.makananpantura.model.request.RegisterRequest
import rizkydwisaputra.id.muslimcoder.makananpantura.model.response.login.LoginResponse

interface SignupContract {
    interface View: BaseView {
        fun onRegisterSuccess(loginResponse: LoginResponse,
                              view:android.view.View)
        fun onRegisterPhotoSuccess(view:android.view.View)
        fun onRegisterFailed(message:String)
    }
    interface Presenter : SignupContract, BasePresenter {
        fun submitRegister(registerRequest: RegisterRequest,
                           view:android.view.View)
        fun submitPhotoRegister(filePath: Uri, view:android.view.View)
    }
}