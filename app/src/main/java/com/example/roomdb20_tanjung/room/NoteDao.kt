package com.example.roomdb20_tanjung.room

import androidx.room.*
@Dao
interface NoteDao {
    @Insert
    fun addNote(note: Note)

    @Query("SELECT * FROM note ORDER BY id DESC")
    fun getNotes() : List<Note>

    @Query("SELECT * FROM note WHERE id=:note_id")
    fun getNote(note_id: Int) : List<Note>

    @Update
    fun updateNote(note: Note)

    @Delete
    fun deleteNote(note: Note)
}