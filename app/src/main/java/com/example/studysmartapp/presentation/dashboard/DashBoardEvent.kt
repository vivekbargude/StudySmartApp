package com.example.studysmartapp.presentation.dashboard

import androidx.compose.ui.graphics.Color
import com.example.studysmartapp.data.local.entity.Session
import com.example.studysmartapp.data.local.entity.Task

sealed class DashBoardEvent {
    data object SaveSubject : DashBoardEvent()
    data object DeleteSession : DashBoardEvent()
    data class OnDeleteSessionButtonClick(val session: Session): DashBoardEvent()
    data class OnTaskIsCompleteChange(val task: Task): DashBoardEvent()
    data class OnSubjectCardColorChange(val colors: List<Color>): DashBoardEvent()
    data class OnSubjectNameChange(val name: String): DashBoardEvent()
    data class OnGoalStudyHoursChange(val hours: String): DashBoardEvent()
}