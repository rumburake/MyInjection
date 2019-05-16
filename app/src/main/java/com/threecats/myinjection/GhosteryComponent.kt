package com.threecats.myinjection

import dagger.Component
import javax.inject.Singleton

@Component
@Singleton
interface GhosteryComponent {

    fun getHauntActionProvider(): HauntActionProvider
}
