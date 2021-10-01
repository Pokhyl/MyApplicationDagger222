package com.example.myapplicationdagger222

import android.app.Application

class MyApplication: Application() {
    var component = DaggerMyComponent.create()
}