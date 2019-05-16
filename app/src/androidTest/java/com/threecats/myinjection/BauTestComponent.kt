package com.threecats.myinjection

import dagger.Component
import javax.inject.Singleton

@Component
@Singleton
interface BauTestComponent {

    fun getBauProvider(): HauntActionProvider
}
