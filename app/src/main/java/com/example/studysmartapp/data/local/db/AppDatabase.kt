package com.example.studysmartapp.data.local.db

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.studysmartapp.data.local.dao.SessionDao
import com.example.studysmartapp.data.local.dao.SubjectDao
import com.example.studysmartapp.data.local.dao.TaskDao
import com.example.studysmartapp.data.local.entity.Session
import com.example.studysmartapp.data.local.entity.Subject
import com.example.studysmartapp.data.local.entity.Task
import com.example.studysmartapp.data.local.typeconverter.ColorListConverter

@Database(
    entities = [Subject::class, Session::class, Task::class],
    version = 1
)
@TypeConverters(ColorListConverter::class)
abstract class AppDatabase: RoomDatabase() {

    abstract fun subjectDao(): SubjectDao
    abstract fun taskDao(): TaskDao
    abstract fun sessionDao(): SessionDao
}