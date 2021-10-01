package com.example.myapplicationdagger222

import dagger.Module
import dagger.Provides

@Module
class MyModule {
    @Provides
    fun createCat(): Cat {
        return Cat("murzik",5)
    }
}