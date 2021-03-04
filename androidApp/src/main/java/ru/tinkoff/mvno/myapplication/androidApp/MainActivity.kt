package ru.tinkoff.mvno.myapplication.androidApp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ru.tinkoff.mvno.myapplication.shared.Greeting
import android.widget.TextView
import ru.tinkoff.mvno.core_ui.BigTruck

fun greet(): String {
    return Greeting(BigTruck()).greeting()
}

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tv: TextView = findViewById(R.id.text_view)
        tv.text = greet()
    }
}
