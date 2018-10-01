package cubex.mahesh.spf_sep7am

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.register_frag.view.*

class RegisterFragment:Fragment( )
{
    override fun onCreateView(inflater: LayoutInflater,
            container: ViewGroup?, savedInstanceState: Bundle?): View? {
    var v = inflater.inflate(R.layout.register_frag,container,
            false)

        v.btnregister.setOnClickListener {

            var spf = activity!!.getSharedPreferences("myprfs",
                                                Context.MODE_PRIVATE)
            var spe = spf.edit()
            spe.putString("email",v.ret1.text.toString())
            spe.putString("pass",v.ret2.text.toString())
            spe.putString("mno",v.ret3.text.toString())
            spe.putString("gender",v.ret4.text.toString())
            spe.putString("dob",v.ret5.text.toString())
            spe.commit()

            var fManager = activity!!.supportFragmentManager
            var tx = fManager.beginTransaction()
            tx.add(R.id.frag1,LoginFragment())
            tx.commit()

        }

        return  v
    }
}