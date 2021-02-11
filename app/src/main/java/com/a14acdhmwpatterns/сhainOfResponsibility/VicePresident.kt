package com.a14acdhmwpatterns.сhainOfResponsibility

class VicePresident : TransactionProcessor() {
    override val approvalLimit = 10_000.0
    override val designation = "vice president"
}