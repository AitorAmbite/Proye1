package com.example.proye1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_table)
        Log.v(MainActivity::class.java.name,"Log v ")
        Log.d(MainActivity::class.java.name,"Log d , es un log de debugging ")
        Log.i(MainActivity::class.java.name,"Log i , es un log de informacion ")
        Log.e(MainActivity::class.java.name,"Log e , es un log de error ") // very importanto

        var hola = getString(R.string.hello)
    }
}