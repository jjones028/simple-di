package io.spektacle

class DependencyContainer {

    private val instances: MutableMap<String, Any> = HashMap()

    fun <T: Any> get(key: String): T = instances[key] as? T ?: error("no dependency found")

    fun <T: Any> put(key: String, obj: T) = instances.put(key, obj)

}