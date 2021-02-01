package com.example.tic_tac_toe.ui.setup

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.tic_tac_toe.R
import com.example.tic_tac_toe.databinding.FragmentSetupBinding
import com.example.tic_tac_toe.databinding.FragmentStartBinding

//will hold the name and character selection
class SetupFragment: Fragment() {
    private val viewModel: SetupViewModel by activityViewModels()
    private var _binding: FragmentSetupBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSetupBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.characterOButton.setOnClickListener {
            viewModel.choosePlayingCharacter("O")
            findNavController().navigate(R.id.action_setupFragment_to_gameFragment)
        }

        binding.characterXButton.setOnClickListener {
            viewModel.choosePlayingCharacter("X")
            findNavController().navigate(R.id.action_setupFragment_to_gameFragment)
        }
    }
}