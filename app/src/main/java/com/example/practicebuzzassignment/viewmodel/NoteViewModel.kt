package com.example.practicebuzzassignment.viewmodel

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import com.example.practicebuzzassignment.model.Note

class NoteViewModel : ViewModel() {
    // A mutable state list of notes for Compose to observe changes.
    private val _notes = mutableStateListOf<Note>()
    val notes: List<Note> get() = _notes

    init {
        // Hardcoded sample notes.
        _notes.addAll(
            listOf(
                Note(id = 1, title = "Sample Note 1", description = "Hi Sumit Singh this side!"),
                Note(id = 2, title = "Sample Note 2", description = "Hope you all are having a good day!")
            )
        )
    }

    fun addNote(title: String, description: String) {
        // Only add note if both title and description are not empty.
        if (title.isNotBlank() && description.isNotBlank()) {
            val newId = if (_notes.isEmpty()) 1 else _notes.maxOf { it.id } + 1
            _notes.add(Note(id = newId, title = title, description = description))
        }
    }
}
