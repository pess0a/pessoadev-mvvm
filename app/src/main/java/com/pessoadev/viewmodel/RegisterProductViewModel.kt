package com.pessoadev.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel

class RegisterProductViewModel : ViewModel() {
    private val productList = ArrayList<Product>()

    fun saveProduct(name: String, quantity: Int) {
        val product = Product(name, quantity)
        productList.add(product)
        log()
    }

    private fun log() {
        productList.forEach {
            Log.i("Product ->", it.toString())
        }
    }
}