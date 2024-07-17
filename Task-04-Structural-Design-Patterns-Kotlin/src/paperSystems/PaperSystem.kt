package paperSystems

class PaperSystem: IPaperSystem {
    override fun signIn(name: String): String {
        return "sign in : $name"
    }

    override fun signOut(name: String): String {
        return "sign out : $name"
    }
}