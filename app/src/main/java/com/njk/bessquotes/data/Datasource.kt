package com.njk.bessquotes.data
import com.njk.bessquotes.R
import com.njk.bessquotes.model.Quote
// Datasource - module that prepares the data for the app to be represented - but the 'data' is a separate concern - https://developer.android.com/codelabs/basic-android-kotlin-training-recyclerview-scrollable-list?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-kotlin-unit-2-pathway-3%3Fhl%3Den%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-training-recyclerview-scrollable-list&hl=en#:~:text=class%20that%20prepares%20the%20data%20for%20the%20app
class Datasource {
    fun loadQuotes() :List<Quote>{
        return listOf<Quote>(
            Quote(R.string.q1,),
            Quote(R.string.q2,),
            Quote(R.string.q3,),
            Quote(R.string.q4,),
            Quote(R.string.q5,),
            Quote(R.string.q6,),
            Quote(R.string.q7,),
            Quote(R.string.q8,),
            Quote(R.string.q9,),
            Quote(R.string.q10,)
        )
    }
}