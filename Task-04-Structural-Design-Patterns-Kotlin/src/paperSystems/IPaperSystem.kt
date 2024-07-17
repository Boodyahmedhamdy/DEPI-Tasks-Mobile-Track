package paperSystems

interface IPaperSystem {
    fun signIn(name: String): String
    fun signOut(name: String): String


}