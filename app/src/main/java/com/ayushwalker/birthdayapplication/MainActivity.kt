package com.ayushwalker.birthdayapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.ayushwalker.birthdayapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       binding=DataBindingUtil. setContentView(this,R.layout.activity_main)

        //--you can also use this below code same functionality--

//        with(binding){
//            createBirthdayButton.setOnClickListener {
//                val name = binding.editTextPersonName.editableText.toString()
//                Toast.makeText(this, "Name is $name" , Toast.LENGTH_SHORT).show()
//            }
//       }
        //------------------------------------------------------------------------------------
    }

    fun createBirthdayCard(view: View) {
        val name = binding.editTextPersonName.editableText.toString()
        Toast.makeText(this, "Name is $name" , Toast.LENGTH_SHORT).show()
    }
}