package com.example.sportclock

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import com.example.sportoclock.R
import androidx.activity.ComponentActivity
import com.example.sportoclock.MainActivity
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import com.example.sportoclock.databinding.ActivityLoginBinding
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class LoginActivity : ComponentActivity() {

    private lateinit var usernameInput: TextInputEditText
    private lateinit var passwordInput: TextInputEditText
    private lateinit var loginButton: MaterialButton
    private lateinit var userInputLayout: TextInputLayout
    private lateinit var passwordInputLayout: TextInputLayout
    private lateinit var usernameErrorText: TextView
    private lateinit var passwordErrorText: TextView
    private lateinit var recoverPasswordButton: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        // Initialize views
        usernameInput = findViewById(R.id.username)
        passwordInput = findViewById(R.id.password)
        loginButton = findViewById(R.id.loginButton)
        userInputLayout = findViewById(R.id.userInputLayout)
        passwordInputLayout = findViewById(R.id.passwordInputLayout)
        usernameErrorText = findViewById(R.id.usernameErrorText)
        passwordErrorText = findViewById(R.id.passwordErrorText)
        recoverPasswordButton = findViewById(R.id.recoverPassword)

        // Login button logic with validation
        loginButton.setOnClickListener {
            val username = usernameInput.text.toString()
            val password = passwordInput.text.toString()

            // Reset previous error states
            userInputLayout.isErrorEnabled = false
            passwordInputLayout.isErrorEnabled = false
            usernameErrorText.visibility = TextView.GONE
            passwordErrorText.visibility = TextView.GONE

            var valid = true

            // Validate username
            if (username.isEmpty()) {
                userInputLayout.isErrorEnabled = true
                userInputLayout.error = "Campo obligatorio"
                // usernameErrorText.visibility = TextView.VISIBLE
                valid = false
            }

            // Validate password
            if (password.isEmpty()) {
                passwordInputLayout.isErrorEnabled = true
                passwordInputLayout.error = "Campo obligatorio"
                // passwordErrorText.visibility = TextView.VISIBLE
                valid = false
            }

            // If both fields are valid, proceed to MainActivity
            if (valid) {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
                finish() // Finish LoginActivity so the user can't go back
            }
        }

        // Open modal dialog when clicking on recover password button
        recoverPasswordButton.setOnClickListener {
            showRecoverPasswordDialog()
        }

    }


    private fun showRecoverPasswordDialog() {
        // Create an AlertDialog
        val dialogView = layoutInflater.inflate(R.layout.dialog_recover_password, null)
        val emailInput = dialogView.findViewById<TextInputEditText>(R.id.emailInput)
        val emailInputLayout = dialogView.findViewById<TextInputLayout>(R.id.emailInputLayout)
        val sendButton = dialogView.findViewById<MaterialButton>(R.id.sendButton)

        val dialog = AlertDialog.Builder(this)
            .setTitle("Recuperar contraseña")
            .setView(dialogView)
            .setCancelable(true)
            .create()

        sendButton.setOnClickListener {
            val email = emailInput.text.toString()

            // Validate email input
            if (email.isEmpty()) {
                emailInputLayout.error = "Campo obligatorio"
            } else if (!android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                emailInputLayout.error = "Correo electrónico no válido"
            } else {
                // Show success message and close dialog
                Toast.makeText(this, "Correo de recuperación enviado", Toast.LENGTH_SHORT).show()
                dialog.dismiss()
            }
        }

        dialog.show()
    }
}
