package com.example.mapagrado

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.mapagrado.databinding.ActivityMain2Binding
import com.google.android.material.dialog.MaterialAlertDialogBuilder

class MainActivity2 : AppCompatActivity() {

    private lateinit var binding: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        // Set up the click listener for the button
        binding.button.setOnClickListener {
            // Create an Intent to start MainActivity
            val intent = Intent(this, MainActivity::class.java)

            // Start the activity
            startActivity(intent)
        }
        binding.button2.setOnClickListener {
            mostrarPopup()


        }



    }
    fun mostrarPopup() {
        // 1. Infla el layout
        val dialogView = layoutInflater.inflate(R.layout.dialog_custom_popup, null)

        // 2. Crea el diálogo usando MaterialAlertDialogBuilder o AlertDialog.Builder
        val dialog = MaterialAlertDialogBuilder(this)
            .setView(dialogView)
            .create()

        // 3. Referencia los elementos del layout
        val btnDespues = dialogView.findViewById<Button>(R.id.btnDespues)
        val btnIniciar = dialogView.findViewById<Button>(R.id.btnIniciar)

        // 4. Configura eventos de clic
        btnDespues.setOnClickListener {
            // Acciones para "Después"
            dialog.dismiss()
        }
        btnIniciar.setOnClickListener {
            // Acciones para "Iniciar"
            dialog.dismiss()
            // Por ejemplo: iniciar otra Activity o lo que necesites
        }

        // 5. Muestra el diálogo
        dialog.show()
    }
}
