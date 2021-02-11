package com.a14acdhmwpatterns.сhainOfResponsibility

class Manager : TransactionProcessor() {
    override val approvalLimit = 1000.0
    override val designation = "manager"
}

