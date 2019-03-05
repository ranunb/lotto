package akj.com

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_test.*

class TestActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)

        button.setOnClickListener{//버튼 클릭시 다른 액티비티 호출
            val intent = Intent(this@TestActivity, MainActivity::class.java)
            startActivity(intent)
        }

        button2.setOnClickListener{//버튼 클릭시 다른 액티비티 호출
            val intent = Intent(this@TestActivity, ConstellationActivity::class.java)
            startActivity(intent)
        }
        button3.setOnClickListener{//버튼 클릭시 다른 액티비티 호출
            val intent = Intent(this@TestActivity, NameActivity::class.java)
            startActivity(intent)
        }
        button4.setOnClickListener{//버튼 클릭시 다른 액티비티 호출
            val intent = Intent(this@TestActivity, ResultActivity::class.java)
            startActivity(intent)
        }


    }
    fun goConstellation(view: View){
        val intent = Intent(this@TestActivity, ConstellationActivity::class.java)
        startActivity(intent)
    }
}
