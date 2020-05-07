package com.hs_worms.android.videoappdemo1

import androidx.annotation.StringRes

data class Question (
    @StringRes val textResId: Int,
    val answer: Boolean
)


