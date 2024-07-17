package paperSystems

class ESystem: IESystem {
    override fun openPc(name: String): String {
        return "open Pc: $name"
    }

    override fun closePc(name: String): String {
        return "close Pc: $name"
    }

    override fun logIn(name: String, password: String): String {
        return "log in : $name"
    }
}