/*
 * *
 *  * Created by seyed on 8/4/21, 1:42 PM
 *  * Copyright (c) 2021 . All rights reserved.
 *  * Last modified 8/4/21, 12:35 PM
 *
 */

package com.seyed.noted.listeners;

import android.view.View;

import com.seyed.noted.entities.Note;

public interface NotesListener {
    void onNoteClicked(View view, Note note, int position);

    void onNoteLongClicked(View view, Note note, int position);
}
