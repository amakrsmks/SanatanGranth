package com.amakrsmks.sanatangranth.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.amakrsmks.sanatangranth.data.dao.VerseDao
import com.amakrsmks.sanatangranth.data.entity.Verse

@Database(entities = [Verse::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract fun verseDao(): VerseDao
}