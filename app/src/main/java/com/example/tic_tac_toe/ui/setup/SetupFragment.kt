package com.example.tic_tac_toe.ui.setup

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.result.ActivityResultCallback
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.ActivityResultRegistry
import androidx.activity.result.contract.ActivityResultContract
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.viewinterop.viewModel
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels



//will hold the name and character selection
class SetupFragment: Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = ComposeView(requireContext()).apply {
        setContent {
            SetupScreen()
        }
    }

    @Composable
    fun SetupScreen() {
        val viewModel: SetupViewModel = viewModel()
        Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceEvenly,
                modifier = Modifier.fillMaxHeight()) {
            SelectCharacter()
            Row {
                CharacterButton(viewModel, "O")
                CharacterButton(viewModel, "X")
            }
        }
    }
    @Composable
    fun SelectCharacter() {
        Text(
            text = "Select your character",
            style = TextStyle(fontSize = 22.sp),
        )
    }
    @Composable
    fun CharacterButton( viewModel: SetupViewModel, character: String) {
        Button(
            onClick = {viewModel.choosePlayingCharacter(character)},
            modifier = Modifier.padding(20.dp)
        ) {
            Text(character)
        }
    }
    @Preview
    @Composable
    fun DefaultPreview(){
        SetupScreen()
    }
}


