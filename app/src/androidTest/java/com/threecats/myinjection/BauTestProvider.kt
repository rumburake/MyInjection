package com.threecats.myinjection

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class BauTestProvider @Inject constructor() {

    fun bau() = "[TEST-BAU]"
}
