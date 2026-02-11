package com.amakrsmks.sanatangranth.data.repository

import com.amakrsmks.sanatangranth.data.dao.VerseDao
import javax.inject.Inject

class VerseRepository @Inject constructor(
    private val verseDao: VerseDao
) {
    suspend fun getVersesByBook(book: String) = verseDao.getVersesByBook(book)

    suspend fun search(query: String) = verseDao.searchVerses(query)
}