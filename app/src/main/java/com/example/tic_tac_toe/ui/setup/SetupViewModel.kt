package com.example.tic_tac_toe.ui.setup

import android.util.Log
import android.view.View
import androidx.lifecycle.ViewModel

class SetupViewModel: ViewModel() {
    private var playerCharacter: String? = null
    private var playerName: String? = null

    fun choosePlayingCharacter(item: String){
        playerCharacter = item
    }

}