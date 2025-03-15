package com.example.sportoclock

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.appcompat.app.AlertDialog
import com.example.sportoclock.databinding.ActivityCreateAccountBinding
import com.google.android.material.button.MaterialButton

class CreateAccountActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityCreateAccountBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Configurar el botón de "Crear cuenta"
        binding.createAccountButton.setOnClickListener { onCreateAccountClicked(binding) }

        // Configurar el botón de "Iniciar sesión con Google"
        binding.googleLoginButton.setOnClickListener {
            showGoogleLoginConfirmationDialog()
        }

        // Configurar el botón de "Iniciar sesión"
        binding.loginButton.setOnClickListener {
            finish() // Vuelve a la pantalla de LoginActivity
        }
    }

    private fun onCreateAccountClicked(binding: ActivityCreateAccountBinding) {
        val username = binding.username.text.toString()
        val email = binding.email.text.toString()
        val password = binding.password.text.toString()

        // Resetear los errores previos
        binding.usernameInputLayout.isErrorEnabled = false
        binding.emailInputLayout.isErrorEnabled = false
        binding.passwordInputLayout.isErrorEnabled = false

        var valid = true

        // Validar el nombre de usuario
        if (username.isEmpty()) {
            binding.usernameInputLayout.isErrorEnabled = true
            binding.usernameInputLayout.error = "Campo obligatorio"
            valid = false
        }

        // Validar el correo electrónico
        if (email.isEmpty()) {
            binding.emailInputLayout.isErrorEnabled = true
            binding.emailInputLayout.error = "Campo obligatorio"
            valid = false
        } else if (!android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            binding.emailInputLayout.isErrorEnabled = true
            binding.emailInputLayout.error = "Correo electrónico no válido"
            valid = false
        }

        // Validar la contraseña
        if (password.isEmpty()) {
            binding.passwordInputLayout.isErrorEnabled = true
            binding.passwordInputLayout.error = "Campo obligatorio"
            valid = false
        }

        // Si todos los campos son válidos, proceder a crear la cuenta
        if (valid) {
            // Lógica para crear la cuenta (aquí podrías integrar con una API, base de datos, etc.)
            Toast.makeText(this, "Cuenta creada exitosamente", Toast.LENGTH_SHORT).show()

            // Redirigir al MainActivity
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish() // Cerrar CreateAccountActivity para que el usuario no regrese a esta pantalla
        }
    }

    // Modal de Confirmación para Iniciar sesión con Google
    private fun showGoogleLoginConfirmationDialog() {
        val dialogView = layoutInflater.inflate(R.layout.dialog_confirmation, null)
        val acceptButton = dialogView.findViewById<MaterialButton>(R.id.acceptButton)

        val dialog = AlertDialog.Builder(this)
            .setView(dialogView)
            .setCancelable(false)
            .create()

        acceptButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish() // Cerrar la actividad actual después de la redirección
            dialog.dismiss()
        }

        dialog.show()
    }
}
