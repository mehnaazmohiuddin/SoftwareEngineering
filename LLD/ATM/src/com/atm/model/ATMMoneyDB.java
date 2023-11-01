package com.atm.model;

import com.atm.model.note.Note1000INR;
import com.atm.model.note.NoteINR500;
import com.sun.source.tree.LiteralTree;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedDeque;

public class ATMMoneyDB {

    private static ATMMoneyDB  this_db = null;
    ConcurrentLinkedDeque<Note> notes ;


    private ATMMoneyDB(){
        notes = new ConcurrentLinkedDeque<>();
        notes.add( new Note1000INR());
        notes.add( new Note1000INR());
        notes.add( new Note1000INR());
        notes.add( new Note1000INR());
        notes.add( new Note1000INR());
        notes.add( new Note1000INR());
        notes.add( new Note1000INR());
        notes.add( new Note1000INR());
        notes.add( new Note1000INR());
        notes.add( new Note1000INR());
        notes.add( new NoteINR500());
        notes.add( new NoteINR500());
        notes.add( new NoteINR500());
    }

    public synchronized ATMMoneyDB getInstance(){
        if(this_db == null){
            this_db = new ATMMoneyDB();
            return this_db;
        }
        return  this_db;
    }

    public synchronized ConcurrentLinkedDeque<Note> getNotes(){
        return notes;
    }





}
