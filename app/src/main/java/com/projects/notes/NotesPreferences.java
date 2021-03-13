package com.projects.notes;

import android.content.Context;
import android.content.SharedPreferences;

public class NotesPreferences {

    private Context context;
    private SharedPreferences sharedPreferences;
    private final String NOME_ARQUIVO = "notes.preferences";
    private final String NAME_KEY = "nome";
    private SharedPreferences.Editor editor;

    public NotesPreferences(Context context) {
        this.context = context;
        sharedPreferences = context.getSharedPreferences(NOME_ARQUIVO, 0);
        editor = sharedPreferences.edit();
    }

    public void saveNote(String note) {
        editor.putString(NAME_KEY, note);
        editor.commit();
    }
    public String recoverNote() {
        return sharedPreferences.getString(NAME_KEY, "");
    }
}
