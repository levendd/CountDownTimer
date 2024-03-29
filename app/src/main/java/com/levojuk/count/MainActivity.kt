package com.levojuk.count

import android.os.Binder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.levojuk.count.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private  lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        object : CountDownTimer(10000,1000){
            override fun onTick(p0: Long) {
                binding.textView.text = "Left : ${p0/1000}"
            }

            override fun onFinish() {
                Toast.makeText(this@MainActivity,"Time Expired",Toast.LENGTH_LONG).show()
            }

        }.start()
    }

}