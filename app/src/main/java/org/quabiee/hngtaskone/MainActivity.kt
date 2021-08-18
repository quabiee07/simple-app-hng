package org.quabiee.hngtaskone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var button: Button
    private lateinit var textView: TextView
    private lateinit var editText: EditText
    var text =""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.button)
        textView =findViewById(R.id.textView)
        editText = findViewById(R.id.editText_et)

        button.setOnClickListener { view ->
            if (editText.text.toString().isEmpty()) {
                Toast.makeText(this, "Empty Fields", Toast.LENGTH_SHORT).show()
            }else {
               text  = editText.text.toString()
               textView.text = text

            }
//
//            if (view.id == button.id) {
//                text =editText.text.toString()
//                textView.text = text
//            }
        }
    }
}