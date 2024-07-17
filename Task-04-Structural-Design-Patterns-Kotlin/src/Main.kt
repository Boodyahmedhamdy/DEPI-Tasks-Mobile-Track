import paperSystems.*


fun main() {
    val name = "boody"

    var system: IPaperSystem = PaperSystem()
    println(system.signIn(name))
    println(system.signOut(name))

    val newSystem = ESystem()
    system = ESystemAdapter(newSystem)
    println(system.signIn(name))
    println(system.signOut(name))

    val aiSystem = AISystem()
    system = AISystemAdapter(aiSystem)
    println(system.signIn(name))
    println(system.signOut(name))

}