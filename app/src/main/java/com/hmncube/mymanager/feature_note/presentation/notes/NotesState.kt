package com.hmncube.mymanager.feature_note.presentation.notes

import com.hmncube.mymanager.feature_note.domain.model.Note
import com.hmncube.mymanager.feature_note.domain.util.NoteOrder
import com.hmncube.mymanager.feature_note.domain.util.OrderType

data class NotesState(
    val notes : List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSectionVisible: Boolean = false
)
