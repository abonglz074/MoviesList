package com.nazarov.movieslist.core

interface App {

    fun getDependenciesProvider(): DependenciesProvider

    fun cleanComponent()
}
