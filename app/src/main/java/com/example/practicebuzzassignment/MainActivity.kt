package com.example.practicebuzzassignment

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.practicebuzzassignment.screen.NoteListScreen
import com.example.practicebuzzassignment.ui.theme.PracticeBuzzAssignmentTheme
import com.example.practicebuzzassignment.viewmodel.NoteViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PracticeBuzzAssignmentTheme {
                val noteViewModel: NoteViewModel = viewModel()
                NoteListScreen(noteViewModel = noteViewModel)
            }
        }
    }
}
