package com.usaclean.thesoapranos.auth.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.usaclean.thesoapranos.R
import com.usaclean.thesoapranos.databinding.ActivityLoginBinding
import com.usaclean.thesoapranos.databinding.ActivityMainBinding

class LoginActivity : AppCompatActivity() {

    private var _binding: ActivityLoginBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            backBtn.setOnClickListener {
                finish()
            }
        }
    }
}