package com.njk.bessquotes

import android.content.Context
import com.njk.bessquotes.adapter.ItemAdapter
import com.njk.bessquotes.model.Quote
import org.junit.Assert.assertEquals
import org.junit.Test
import org.mockito.Mockito.mock

class QuoteAdapterTests {
    private val context = mock(Context::class.java) // unit test runs in JVM, so does not contain a context.
    @Test                                           // mock creates a 'context' so we can perform actions using the 'context'
    fun adapter_size(){
        val data = listOf(
            Quote(R.string.q1, R.drawable.image1) ,
            Quote(R.string.q2, R.drawable.image2)
        )
        val adapter = ItemAdapter(context, data)
        assertEquals("Item adapter is not the correct size", data.size, adapter.itemCount)
    }
}