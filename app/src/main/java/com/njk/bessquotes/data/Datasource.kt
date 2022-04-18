package com.njk.bessquotes.data
import com.njk.bessquotes.R
import com.njk.bessquotes.model.Quote
// Datasource - module that prepares the data for the app to be represented - but the 'data' is a separate concern - https://developer.android.com/codelabs/basic-android-kotlin-training-recyclerview-scrollable-list?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-kotlin-unit-2-pathway-3%3Fhl%3Den%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-training-recyclerview-scrollable-list&hl=en#:~:text=class%20that%20prepares%20the%20data%20for%20the%20app
class Datasource {
    fun loadQuotes() :List<Quote>{
        return listOf<Quote>(
            Quote(R.string.q1,R.drawable.image1),
            Quote(R.string.q2,R.drawable.image2),
            Quote(R.string.q3,R.drawable.image3),
            Quote(R.string.q4,R.drawable.image4),
            Quote(R.string.q5,R.drawable.image5),
            Quote(R.string.q6,R.drawable.image6),
            Quote(R.string.q7,R.drawable.image7),
            Quote(R.string.q8,R.drawable.image8),
            Quote(R.string.q9,R.drawable.image9),
            Quote(R.string.q10,R.drawable.image10)
        )
    }
}