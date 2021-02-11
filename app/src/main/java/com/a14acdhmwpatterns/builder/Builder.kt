package com.a14acdhmwpatterns.builder

class Pizza private constructor(){
    var cheese = 1
        set(value) {
            if (value > 3) field = 3
            if (value < 1) field = 1
        }
    var chickenMeat = false
    var sausages = false
    var balyk = false
    var currySauce = false
    var barbecueSauce = false
    var corn = false


    class Builder {
        private val pizza = Pizza()

        fun setCheese(value: Int): Builder {
            pizza.cheese = value
            return this
        }

        fun setChickenMeat(flag: Boolean): Builder {
            pizza.chickenMeat = flag
            return this
        }

        fun setSausages(flag: Boolean): Builder {
            pizza.sausages = flag
            return this
        }

        fun setBalyk(flag: Boolean): Builder {
            pizza.balyk = flag
            return this
        }

        fun setBarbecueSauce(flag: Boolean): Builder {
            pizza.barbecueSauce = flag
            return this
        }

        fun setCurrySauce(flag: Boolean) : Builder{
            pizza.currySauce = flag
            return this
        }

        fun setCorn(flag: Boolean): Builder {
            pizza.corn = flag
            return this
        }

        fun build(): Pizza = this.pizza
    }

    override fun toString(): String {
        return "Pizza(cheese=$cheese, chickenMeat=$chickenMeat, sausages=$sausages, balyk=$balyk, currySauce=$currySauce, barbecueSauce=$barbecueSauce, corn=$corn)"
    }
}

fun main() {
    val meetPizza = Pizza.Builder()
        .setChickenMeat(true)
        .setBalyk(true)
        .setCheese(2)
        .setSausages(true)
        .setCorn(false)
        .setBarbecueSauce(true)
        .build()

    println(meetPizza)
}