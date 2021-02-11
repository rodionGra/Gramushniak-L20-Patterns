package com.a14acdhmwpatterns.composite

private interface IShape{
    fun draw()
}

private class Square : IShape{
    override fun draw() { println("Square") }
}

private class Triangle: IShape{
    override fun draw() { println("Triangle") }
}

private class Circle: IShape{
    override fun draw() { println("Circle") }
}

private class Composite: IShape{
    val componentList : MutableList<IShape> = mutableListOf()

    override fun draw() {
        for (shape in componentList){ shape.draw() }
    }
}

fun main() {
    val square1 : IShape = Square()
    val square2 : IShape = Square()
    val square3 : IShape = Square()
    val circle1 : IShape = Circle()
    val circle2 : IShape = Circle()
    val triangle1 : IShape = Triangle()

    val composite1 = Composite()
    composite1.componentList.add(square1)
    composite1.componentList.add(circle1)
    composite1.componentList.add(triangle1)

    val composite2 = Composite()
    composite2.componentList.add(square2)
    composite2.componentList.add(circle2)
    composite2.componentList.add(composite1)

    val composite3 = Composite()
    composite3.componentList.add(square3)
    composite3.componentList.add(composite2)

    composite3.draw()
}