package com.a14acdhmwpatterns.proxy

interface Pizza {
    fun deliverPizza()
}

class RealPizza(private val name: String) : Pizza {
    init {
        cookPizza()
    }

    private fun cookPizza() {
        println("Pizza is $name cooking...")
    }

    override fun deliverPizza() {
        println("Pizza $name was delivered to the address...")
    }
}

class ProxyPizza(private val name: String) : Pizza {
    private var pizza: RealPizza? = null

    override fun deliverPizza() {
        if (pizza == null) {
            pizza = RealPizza(name)
        }
        pizza?.deliverPizza()
    }
}

fun main() {
    val pizza: Pizza =
        ProxyPizza("Margarita")

    //pizza will be cooked only when it is ordered
    pizza.deliverPizza()
}
