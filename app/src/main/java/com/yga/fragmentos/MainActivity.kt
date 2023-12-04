package com.yga.fragmentos


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mkrdeveloper.fragmentexample2.primer_fragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        val primerFragment = primer_fragment()

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fragmentContainer,primerFragment)
                .commit()
        }
    }
}