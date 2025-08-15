package com.example.studysmartapp.data.local.entity

import android.graphics.Color
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.studysmartapp.ui.theme.*

@Entity
data class Subject(
    val name: String,
    val goalHours: Float,
    val colors: List<Color>,
    @PrimaryKey(autoGenerate = true)
    val subjectId: Int? = null
) {
    companion object {
        val subjectCardColors = listOf(gradient1, gradient2, gradient3, gradient4, gradient5)
    }
}