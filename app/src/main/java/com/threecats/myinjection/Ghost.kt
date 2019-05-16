package com.threecats.myinjection

data class Ghost(
    val name: String
) {
    private val hauntingAction: String = App.instance.ghosteryComponent.getHauntActionProvider().hauntAction

    fun haunt() = "Ghost $name is haunting: $hauntingAction"
}
