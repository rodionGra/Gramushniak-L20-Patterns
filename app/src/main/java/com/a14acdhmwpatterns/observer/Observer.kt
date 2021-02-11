package com.a14acdhmwpatterns.observer

interface Observer {
    fun handleEvent(vacancies: List<String>)
}

interface Observed {
    fun addObserver(observer: Observer)

    fun removeObserver(observer: Observer)

    fun notifyObserver()
}

class Subscriber(private val name: String) : Observer {
    override fun handleEvent(vacancies: List<String>) {
        println("Dear $name. We have new vacancy + \n$vacancies\n\n")
    }
}

class JavaDeveloperJobSite: Observed{
    private val vacancies : MutableList<String> = mutableListOf()
    private val subscribers : MutableList<Observer> = mutableListOf()

    fun addVacancy(vacancy: String){
        this.vacancies.add(vacancy)
        notifyObserver()
    }

    fun removeVacancy(vacancy: String){
        this.vacancies.remove(vacancy)
        notifyObserver()
    }

    override fun addObserver(observer: Observer) {
        this.subscribers.add(observer)
    }

    override fun removeObserver(observer: Observer) {
        this.subscribers.remove(observer)
    }

    override fun notifyObserver() {
        for (observer in subscribers){
            observer.handleEvent(this.vacancies)
        }
    }
}


fun main() {
    val jobSite = JavaDeveloperJobSite()

    jobSite.addVacancy("First Java Position")
    jobSite.addVacancy("Second Java Position")

    val firstSubscriber = Subscriber("Rodion")
    val secondSubscriber = Subscriber("Alex")

    jobSite.addObserver(firstSubscriber)
    jobSite.addObserver(secondSubscriber)

    jobSite.addVacancy("Third Java Position")
    println("==============================================================")
    jobSite.removeVacancy("First Java Position")
}







