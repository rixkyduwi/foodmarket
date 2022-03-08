package rizkydwisaputra.id.muslimcoder.makananpantura.ui.auth

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import rizkydwisaputra.id.muslimcoder.makananpantura.R

class AuthActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val PageRequest =intent.getIntExtra("page Request",0)
        if(PageRequest==2){
            toolbarSignUp()
            val navOptions=NavOptions.Builder()
                .setPopUpTo(R.id.fragmentSignIn,true)
                .build()
            Navigation.findNewController(findViewById(R.id.authHostFragemnt))
                .navigate(R.id.action_signup,null,navOptions)

        }
        fun toolbarSignUp(){
           toolbar.title="Sign Up"
           toolbar.subtitle="Register and Eat"
           toolbar.navigationIcon=resources.getDrawable(R.drawable.ic_arrow_back_000,null)
           toolbar.setNavigationOnClickListener{onBackPressed()}
        }
    }
}