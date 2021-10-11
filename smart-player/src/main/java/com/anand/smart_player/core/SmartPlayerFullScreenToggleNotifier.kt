package com.anand.smart_player.core

/**
 * Created by Anand Singh on 02-08-2021
 * */

/*
To notify the app of the player's full screen button presses/toggle for full screen toggle request
by the user.
*/
interface SmartPlayerFullScreenToggleNotifier {
    fun togglePlayerFullScreen(makeFullScreen: Boolean)
}