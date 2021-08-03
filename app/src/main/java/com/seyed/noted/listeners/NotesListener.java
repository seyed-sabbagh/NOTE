package com.seyed.noted.listeners;

import android.view.View;

import com.seyed.noted.entities.Note;

public interface NotesListener {
    void onNoteClicked(View view, Note note, int position);

    void onNoteLongClicked(View view, Note note, int position);
}
