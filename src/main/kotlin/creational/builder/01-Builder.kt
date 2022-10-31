package creational.builder

class Element {

    inner class Builder(
        var name: String,
        var size: Int
    ) {
        fun name(value: String) = apply { this.name = value }

        fun size(value: Int) = apply { this.size = value }

        fun build(): Element {
            return Element()
        }
    }
}