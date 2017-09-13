class LazyProperty2(private val initializer: () -> Int) {
    val lazyValue: Int by lazy(initializer)
}

fun main(args: Array<String>) {
    var initialized2 = false
//    val lazyProperty2 = LazyProperty2({ initialized2 = true;42 })
//    println(lazyProperty2.lazyValue)
//    println(initialized2)
    val man = Man({ initialized2 = true;"xie" }, { initialized2 = false;20 })
    println(man.lazyName)
    println(man.lazyAge)
    println(initialized2)
}

class Man(val name: () -> String, val age: () -> Int) {
    val lazyName: String by lazy(name)
    val lazyAge: Int by lazy(age)
}