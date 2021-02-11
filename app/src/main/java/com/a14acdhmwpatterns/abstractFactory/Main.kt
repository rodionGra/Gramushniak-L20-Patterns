package com.a14acdhmwpatterns.abstractFactory

fun main() {
    val projectTeamFactory = WebTeamFactory()
    val developer = projectTeamFactory.getDeveloper()
    val tester = projectTeamFactory.getTester()
    val projectManager = projectTeamFactory.getProjectManager()

    println("Creating web site")
    developer.writeCode()
    tester.testCode()
    projectManager.manageProject()

    val projectBandTeamFactory = BankingTeamFactory()
    val bankDeveloper = projectBandTeamFactory.getDeveloper()
    val bankTester = projectBandTeamFactory.getTester()
    val bankProjectManager = projectBandTeamFactory.getProjectManager()

    println("\nCreating bank server")
    bankDeveloper.writeCode()
    bankTester.testCode()
    bankProjectManager.manageProject()

}