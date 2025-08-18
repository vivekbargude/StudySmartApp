package com.example.studysmartapp.presentation.dashboard.states_events

import androidx.compose.ui.graphics.Color
import com.example.studysmartapp.data.local.entity.Session
import com.example.studysmartapp.data.local.entity.Subject

data class DashboardState(
    val totalSubjectCount: Int = 0,
    val totalStudiedHours: Float = 0f,
    val totalGoalStudyHours: Float = 0f,
    val subjects: List<Subject> = emptyList(),
    val subjectName: String = "",
    val goalStudyHours: String = "",
    val subjectCardColors: List<Color> = Subject.subjectCardColors.random(),
    val session: Session? = null
)