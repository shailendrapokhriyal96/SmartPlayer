package com.anand.smart_player.ui

import android.content.Context
import android.util.AttributeSet
import com.anand.smart_player.R
import com.google.android.exoplayer2.ui.StyledPlayerView
import com.orhanobut.logger.Logger

/**
 * Created by Anand Singh on 29-07-2021
 * */
class SmartPlayerView : StyledPlayerView {

    constructor(context: Context) : super(context) {
        initializeView()
    }

    constructor(context: Context, attrs: AttributeSet?, defStyle: Int) : super(
        context,
        attrs,
        defStyle
    ) {
        initializeView()
    }

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {
        initializeView()
    }

    private fun initializeView() {
        inflate(context, R.layout.smart_player, this)
    }
}