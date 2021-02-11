package com.a14acdhmwpatterns.сhainOfResponsibility

abstract class TransactionProcessor {
    private var transactionProcessor: TransactionProcessor? = null
    protected abstract val approvalLimit: Double
    protected abstract val designation: String

    fun setSuccessor(transactionProcessor: TransactionProcessor) {
        this.transactionProcessor = transactionProcessor
    }

    fun approve(transaction: Transaction) {
        if (transaction.amount <= approvalLimit) {
            println("transaction for amount %s approved by ${transaction.amount} $designation")
        } else if (transactionProcessor == null) {
            println("transaction amount  ${transaction.amount} is higher than approval limit!")
            return
        }
        transactionProcessor?.approve(transaction)
    }
}