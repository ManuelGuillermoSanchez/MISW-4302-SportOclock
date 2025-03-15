package com.example.sportoclock

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import com.google.android.material.switchmaterial.SwitchMaterial
import androidx.fragment.app.Fragment
import com.example.sportclock.LoginActivity
import com.example.sportoclock.databinding.FragmentSettingsBinding


class SettingsFragment : Fragment() {

    private var _binding: FragmentSettingsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflar el layout con ViewBinding
        _binding = FragmentSettingsBinding.inflate(inflater, container, false)
        val root: View = binding.root


        // Referencia al Switch de Notificación
        val notificationSwitch: SwitchMaterial = binding.notificationSwitch
        notificationSwitch.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                Toast.makeText(requireContext(), "Notificación Activada", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(requireContext(), "Notificación Desactivada", Toast.LENGTH_SHORT).show()
            }
        }

        // Botón Cerrar Sesión
        val logoutButton: Button = binding.logoutButton
        logoutButton.setOnClickListener {
            // Regresar a la actividad de Login
            val intent = Intent(activity, LoginActivity::class.java)
            startActivity(intent)
            requireActivity().finish() // Finaliza la actividad actual para evitar regresar con el botón de atrás
        }

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
