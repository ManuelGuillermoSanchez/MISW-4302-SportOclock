package com.example.sportclock

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class LoginActivity : AppCompatActivity() {

    private lateinit var usernameInput: TextInputEditText
    private lateinit var passwordInput: TextInputEditText
    private lateinit var loginButton: MaterialButton
    private lateinit var googleLoginButton: MaterialButton
    private lateinit var createAccountButton: MaterialButton
    private lateinit var recoverPasswordButton: TextInputLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        usernameInput = findViewById(R.id.username)
        passwordInput = findViewById(R.id.password)
        loginButton = findViewById(R.id.loginButton)
        googleLoginButton = findViewById(R.id.googleLoginButton)
        createAccountButton = findViewById(R.id.createAccountButton)
        recoverPasswordButton = findViewById(R.id.recoverPassword)

        loginButton.setOnClickListener {
            val username = usernameInput.text.toString()
            val password = passwordInput.text.toString()
            if (username.isNotEmpty() && password.isNotEmpty()) {
                // Aquí puedes agregar la lógica para hacer login
                Toast.makeText(this, "Iniciando sesión...", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Por favor, complete los campos.", Toast.LENGTH_SHORT).show()
            }
        }

        googleLoginButton.setOnClickListener {
            // Lógica para iniciar sesión con Google
            Toast.makeText(this, "Iniciando sesión con Google...", Toast.LENGTH_SHORT).show()
        }

        createAccountButton.setOnClickListener {
            // Lógica para redirigir a la pantalla de crear cuenta
            Toast.makeText(this, "Redirigiendo a crear cuenta...", Toast.LENGTH_SHORT).show()
        }

        recoverPasswordButton.setOnClickListener {
            // Lógica para recuperar la contraseña
            Toast.makeText(this, "Recuperando contraseña...", Toast.LENGTH_SHORT).show()
        }
    }
}
