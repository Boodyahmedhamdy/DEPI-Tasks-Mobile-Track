package paperSystems

interface IESystem {

    fun openPc(name: String): String

    fun closePc(name: String): String

    fun logIn(name: String, password: String): String
}