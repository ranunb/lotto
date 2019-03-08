package akj.com

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(applicationContext, "MainActivity 입니다.", Toast.LENGTH_LONG).show()

    }
    fun goConstellationActivity(view: View){ //명시적 intent
        val intent = Intent(this@MainActivity, ConstellationActivity::class.java)
        startActivity(intent)
    }
    fun goNameActivity(view: View){ //명시적 intent
        val intent = Intent(this@MainActivity, NameActivity::class.java)
        startActivity(intent)
    }
}
