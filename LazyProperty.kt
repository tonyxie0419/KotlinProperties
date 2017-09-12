fun main(args: Array<String>) {
    var initialized = false
    val lazyProperty = LazyProperty({ initialized = true;42 })
    val result: Int = lazyProperty.lazy

    println(result)
}

class LazyProperty(val initializer: () -> Int) {
    var value: Int? = null
    val lazy: Int
        get() {
            if (value == null) {
                value = initializer()
            }
            return value!!
        }
}
