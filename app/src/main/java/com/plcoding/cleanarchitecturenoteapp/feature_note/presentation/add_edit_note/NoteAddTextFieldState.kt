package com.plcoding.cleanarchitecturenoteapp.feature_note.presentation.add_edit_note

data class NoteAddTextFieldState(
    val text: String = "",
    val hint: String = "",
    val isHintVisible: Boolean = true
)