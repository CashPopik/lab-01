package com.example.petshop

class Bored(date: String): Mood(date) {
    override fun vibe(): String{
        return "My vibe is Bored :/"
    }
}