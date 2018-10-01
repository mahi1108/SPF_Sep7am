package cubex.mahesh.spf_sep7am

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.login_frag.view.*

class LoginFragment:Fragment( )
{
    override fun onCreateView(inflater: LayoutInflater,
            container: ViewGroup?, savedInstanceState: Bundle?): View? {
    var v = inflater.inflate(R.layout.login_frag,container,
            false)

        v.btnregister.setOnClickListener {
                var fManager = activity!!.supportFragmentManager
                var tx = fManager.beginTransaction()
                tx.replace(R.id.frag1, RegisterFragment())
                 tx.addToBackStack("true")
            tx.commit()
        }

        v.btnlogin.setOnClickListener {

            var spf = activity!!.getSharedPreferences("myprfs",
                    Context.MODE_PRIVATE)
            var email = spf.getString("email","no value")
            var pass = spf.getString("pass","no value")

            if(email.equals(v.let1.text.toString()) &&
                    pass.equals(v.let2.text.toString())){
                var fManager = activity!!.supportFragmentManager
                var tx = fManager.beginTransaction()
                tx.replace(R.id.frag1, WelcomeFragment())
                tx.addToBackStack("true")
                tx.commit()
            }else{
                Toast.makeText(activity!!,"Invalid User..",
                        Toast.LENGTH_LONG).show()
            }


        }

        return  v
    }
}