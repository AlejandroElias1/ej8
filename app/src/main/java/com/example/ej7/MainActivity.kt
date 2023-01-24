package com.example.ej7


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ej7.databinding.ActivityMainBinding




class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.continuar.setOnClickListener(){
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }
        camImage(binding)
    }

    fun camImage(binding: ActivityMainBinding){
        binding.elfo.setOnClickListener {
            binding.imageView.setImageResource(R.drawable.elfo)
        }
        binding.humano.setOnClickListener {
            binding.imageView.setImageResource(R.drawable.humano)
        }
        binding.enano.setOnClickListener {
            binding.imageView.setImageResource(R.drawable.enano)
        }
        binding.goblin.setOnClickListener {
            binding.imageView.setImageResource(R.drawable.goblin)
        }



    }
}