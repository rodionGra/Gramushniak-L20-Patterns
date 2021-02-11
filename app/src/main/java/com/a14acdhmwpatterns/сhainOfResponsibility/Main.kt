package com.a14acdhmwpatterns.сhainOfResponsibility

fun main() {
    val manager = Manager()
    val vicePresident = VicePresident()
    val ceo = CEO()

    manager.setSuccessor(vicePresident)
    vicePresident.setSuccessor(ceo)
    //not setting successor for CEO because CEO is the highest level in the company

    manager.approve(Transaction(500.0, "general"))
    manager.approve(Transaction(1200.0, "general"))
    manager.approve(Transaction(25000.0, "general"))
    manager.approve(Transaction(500000.0, "general"))
}