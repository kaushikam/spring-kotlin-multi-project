package com.kaushikam.example

class HelloApp {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val message = Message("kaushik")
            println(message.hello())
        }
    }
}