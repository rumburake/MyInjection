package com.threecats.myinjection

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class HauntActionProvider @Inject constructor() {

    val hauntAction = "Boo!!!..."
}
