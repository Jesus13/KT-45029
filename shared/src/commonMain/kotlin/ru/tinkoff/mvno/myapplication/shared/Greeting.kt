package ru.tinkoff.mvno.myapplication.shared

import ru.tinkoff.mvno.core_ui.Truck

class Greeting(private val truck: Truck) {

    fun greeting(): String {
        return "Hello, ${Platform().platform} + ${truck.getName()}:!"
    }

}
