package rizkydwisaputra.id.muslimcoder.makananpantura.ui.auth.signin

import android.app.Dialog
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import rizkydwisaputra.id.muslimcoder.makananpantura.MainActivity
import rizkydwisaputra.id.muslimcoder.makananpantura.R

class SignInFragment : Fragment() {
    lateinit var SignInPresenter
    var progressDialog:Dialog?=null

    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        presenter=SignInPresenter(this)
        if (!FoodMarket.getapp().getToken.isNullOrEmpety()){
            val home = Intent(activity,MainActivity::class.java)
            startActivity(home)
            activity?.finish()
        }
        initDummy()
        initDummy()
        btnsignup.setOnClickListener(
            var email=etEmail.text.toString()
            var password=etPassword.text.toString()
            if (email.isNullOrEmpety()){
                etEmail.error="Silahkan masukan emailnya"
                etEmail.requestFocus()
            }else if (password){
                etPassword.error="Silahkan masukan passwordnya"
                etEmail.requestFocus()
            }else{
                presenter.sub (etLogin(email,password))
            }
        )
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sign_in, container, false)
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment SignInFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            SignInFragment().apply {
                arguments = Bundle().apply {

                }
            }
    }
}