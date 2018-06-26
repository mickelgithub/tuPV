package es.kotlin.misdesarrollos.tupv

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.support.v4.view.ViewCompat
import android.widget.Toast

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        postDelay(5000)



    }

    fun postDelay(delay: Long) {
        val handler= Handler()
        handler.postDelayed({}, delay)
        Toast.makeText(this, "Holaaaaa", Toast.LENGTH_LONG)
    }
}
