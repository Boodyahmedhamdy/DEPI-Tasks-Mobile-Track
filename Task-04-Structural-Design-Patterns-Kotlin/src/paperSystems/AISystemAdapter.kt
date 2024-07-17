package paperSystems

class AISystemAdapter(
    private val aiSystem: AISystem
): IPaperSystem {
    override fun signIn(name: String): String {
        return aiSystem.hello(name)
    }

    override fun signOut(name: String): String {
        return aiSystem.bye(name)
    }
}