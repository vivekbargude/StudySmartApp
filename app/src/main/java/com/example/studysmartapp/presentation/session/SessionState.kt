package com.example.studysmartapp.presentation.session

import com.example.studysmartapp.data.local.entity.Session
import com.example.studysmartapp.data.local.entity.Subject

data class SessionState(
    val subjects: List<Subject> = emptyList(),
    val sessions: List<Session> = emptyList(),
    val relatedToSubject: String? = null,
    val subjectId: Int? = null,
    val session: Session? = null
)