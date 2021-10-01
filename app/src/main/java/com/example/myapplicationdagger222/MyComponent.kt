package com.example.myapplicationdagger222

import dagger.Component

@Component(modules = [MyModule::class])
interface MyComponent {
    fun inject(mainActivity: MainActivity)
    fun inject(blankFragment: BlankFragment)
}
