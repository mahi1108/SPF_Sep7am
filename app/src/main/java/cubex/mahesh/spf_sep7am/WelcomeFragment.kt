package cubex.mahesh.spf_sep7am

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.welcome_frag.*
import kotlinx.android.synthetic.main.welcome_frag.view.*

class WelcomeFragment:Fragment( )
{
    override fun onCreateView(inflater: LayoutInflater,
            container: ViewGroup?, savedInstanceState: Bundle?): View? {
    var v = inflater.inflate(R.layout.welcome_frag,container,
            false)

        var spf = activity!!.getSharedPreferences("myprfs",
                Context.MODE_PRIVATE)
        var email = spf.getString("email","no value")
        v.wtv1.text = "Welcome :  \n $email"

        return  v
    }
}