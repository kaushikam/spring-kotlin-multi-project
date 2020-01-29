package com.kaushikam.example

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class MessageTest {
    @Test
    fun `test hello world`() {
        val message = Message("kaushik")
        assertEquals("Hello, kaushik!", message.hello())
    }
}