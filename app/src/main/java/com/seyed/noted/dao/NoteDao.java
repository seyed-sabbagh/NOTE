/*
 * *
 *  * Created by seyed on 8/4/21, 1:42 PM
 *  * Copyright (c) 2021 . All rights reserved.
 *  * Last modified 8/4/21, 12:35 PM
 *
 */

package com.seyed.noted.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.seyed.noted.entities.Note;

import java.util.List;

@Dao
public interface NoteDao {

    @Query("SELECT * FROM notes ORDER BY id DESC")
    List<Note> getAllNotes();

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertNote(Note note);

    @Delete
    void deleteNote(Note note);
}
