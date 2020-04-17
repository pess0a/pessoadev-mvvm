package com.pessoadev.viewmodel

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import kotlinx.android.synthetic.main.activity_register_product.*

class RegisterProductActivity : AppCompatActivity() {

    private lateinit var vm: RegisterProductViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_product)

        vm = ViewModelProvider(this).get(RegisterProductViewModel::class.java)

        setupListeners()
    }

    private fun setupListeners() {
        buttonSave.setOnClickListener {
            val name = textInputName.text.toString()
            val quantity = textInputQuantity.text.toString().toInt()
            vm.saveProduct(name, quantity)
        }
    }
}
