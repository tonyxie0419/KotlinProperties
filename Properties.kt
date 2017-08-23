fun main(args: Array<String>) {
    val q = PropertyExample()
    q.propertyWithCounter = 14
    q.propertyWithCounter = 21
    q.propertyWithCounter = 32
    println(q.counter)
    println(q.propertyWithCounter!!)
}

class PropertyExample() {
    var counter = 0
    var propertyWithCounter: Int? = null
        set(value: Int?) {
            field = value
            counter++
        }
}