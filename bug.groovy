def someMethod() {
    def map = [:]
    map.a = 1
    map.b = 2
    map.each { key, value ->
        println "key: $key, value: $value"
        if (key == "a") {
            map.remove("b")
        }
    }
    println map
}
someMethod()