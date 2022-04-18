package com.njk.bessquotes.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

// represent just one Quote ie., 'data' | @Resource Annotations
data class Quote(
    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int
    )