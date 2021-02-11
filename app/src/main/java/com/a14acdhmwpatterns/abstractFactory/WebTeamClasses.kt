package com.a14acdhmwpatterns.abstractFactory

class WebPhpDeveloper : Developer {
    override fun writeCode() {
        println("Php developer writes php code")
    }
}

class WebQATester : Tester {
    override fun testCode() {
        println("Web QA tester tests sites")
    }
}

class WebProjectManager : ProjectManager {
    override fun manageProject() {
        println("Website PM manages website project")
    }
}