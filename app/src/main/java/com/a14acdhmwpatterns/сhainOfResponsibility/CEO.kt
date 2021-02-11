package com.a14acdhmwpatterns.сhainOfResponsibility

internal class CEO : TransactionProcessor() {
    override val approvalLimit = 100_000.0
    override val designation = "CEO"
}