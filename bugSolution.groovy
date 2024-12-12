def someMethod() {
    def map = [:]
    map.a = 1
    map.b = 2
    def keysToRemove = []
    map.each { key, value ->
        if (key == "a") {
            keysToRemove << key
        }
    }
    keysToRemove.each { key ->
        map.remove(key)
    }
    println map
}
someMethod()