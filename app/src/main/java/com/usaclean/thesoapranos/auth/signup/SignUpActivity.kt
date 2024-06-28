package com.usaclean.thesoapranos.auth.signup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.usaclean.thesoapranos.R
import com.usaclean.thesoapranos.databinding.ActivityLoginBinding
import com.usaclean.thesoapranos.databinding.ActivitySignUpBinding

class SignUpActivity : AppCompatActivity() {

    private var _binding: ActivitySignUpBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivitySignUpBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            backBtn.setOnClickListener {
                finish()
            }
        }
    }
}