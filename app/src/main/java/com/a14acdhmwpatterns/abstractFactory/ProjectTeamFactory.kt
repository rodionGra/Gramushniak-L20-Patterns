package com.a14acdhmwpatterns.abstractFactory

interface ProjectTeamFactory {
    fun getDeveloper(): Developer
    fun getTester(): Tester
    fun getProjectManager(): ProjectManager
}

class BankingTeamFactory : ProjectTeamFactory {
    override fun getDeveloper(): Developer {
        return BankingJavaDeveloper()
    }

    override fun getTester(): Tester {
        return BankingQATester()
    }

    override fun getProjectManager(): ProjectManager {
        return BankingProjectManager()
    }
}

class WebTeamFactory : ProjectTeamFactory {
    override fun getDeveloper(): Developer {
        return WebPhpDeveloper()
    }

    override fun getTester(): Tester {
        return WebQATester()
    }

    override fun getProjectManager(): ProjectManager {
        return WebProjectManager()
    }
}