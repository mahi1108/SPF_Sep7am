package cubex.mahesh.spf_sep7am

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var fManager = supportFragmentManager
        var tx = fManager.beginTransaction()
        tx.add(R.id.frag1,LoginFragment())
        tx.addToBackStack("true")
        tx.commit()
    }
}
