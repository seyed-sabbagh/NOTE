/*
 * *
 *  * Created by seyed on 8/4/21, 1:42 PM
 *  * Copyright (c) 2021 . All rights reserved.
 *  * Last modified 8/4/21, 12:35 PM
 *
 */

package com.seyed.noted.database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.seyed.noted.dao.NoteDao;
import com.seyed.noted.entities.Note;

@Database(entities = Note.class, version = 1, exportSchema = false)
public abstract class NotesDatabase extends RoomDatabase {

    private static NotesDatabase notesDatabase;

    public static synchronized NotesDatabase getDatabase(Context context) {
        if (notesDatabase == null) {
            notesDatabase = Room.databaseBuilder(
                    context,
                    NotesDatabase.class,
                    "notes_db"
            ).build();
        }
        return notesDatabase;
    }

    public abstract NoteDao noteDao();
}
