class LazyProperty2(val initializer: () -> Int) {
    val lazyValue: Int by lazy(initializer)
}

fun main(args: Array<String>) {
    var initialized2 = false
    val lazyProperty2 = LazyProperty2({ initialized2 = true;42 })
    println(lazyProperty2.lazyValue)
}