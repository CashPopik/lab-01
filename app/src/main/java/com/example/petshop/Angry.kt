package com.example.petshop

class Angry(date: String): Mood(date) {
    override fun vibe(): String{
        return "My vibe is Angry!!! >:("
    }
}