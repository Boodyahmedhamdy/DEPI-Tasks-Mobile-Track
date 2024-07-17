package paperSystems

class ESystemAdapter(
    private val eSystem: ESystem
): IPaperSystem {



    override fun signIn(name: String): String {
        return eSystem.openPc(name)
    }

    override fun signOut(name: String): String {
        return eSystem.closePc(name)
    }


}