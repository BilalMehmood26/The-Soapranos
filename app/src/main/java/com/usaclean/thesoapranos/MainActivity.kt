package com.usaclean.thesoapranos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.usaclean.thesoapranos.auth.login.LoginActivity
import com.usaclean.thesoapranos.auth.signup.SignUpActivity
import com.usaclean.thesoapranos.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var _binding: ActivityMainBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            loginBtn.setOnClickListener {
                startActivity(Intent(this@MainActivity,LoginActivity::class.java))
            }

            createAccountBtn.setOnClickListener {
                startActivity(Intent(this@MainActivity,SignUpActivity::class.java))
            }
        }
    }
}