package com.a14acdhmwpatterns.abstractFactory

class BankingJavaDeveloper : Developer {
    override fun writeCode() {
        println("Java developer writes java code")
    }
}

class BankingQATester : Tester {
    override fun testCode() {
        println("QA tester tests backing code")
    }
}

class BankingProjectManager : ProjectManager {
    override fun manageProject() {
        println("Banking PM manages banking project")
    }
}