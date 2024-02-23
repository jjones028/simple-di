package io.spektacle

fun main() {
    val dependencyContainer = DependencyContainer()
    dependencyContainer.put("string1", "hello")
    dependencyContainer.put("string2", "world")
    dependencyContainer.put("int", 1)

    println("${dependencyContainer.get<String>("string1")} ${dependencyContainer.get<String>("string2")}")
}