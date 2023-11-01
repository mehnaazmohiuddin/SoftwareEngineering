package com.atm.model.note;

import com.atm.model.Currency;
import com.atm.model.Note;

public class NoteINR500 implements Note {

    double id;
    public double getId() {
        return id;
    }


    @Override
    public Currency getCurrency() {
        return Currency.INR;
    }

    @Override
    public int getValue() {
        return 500;
    }
    public NoteINR500 (){
        id = Math.random();
    }

    @Override
    public boolean equals(Object obj) {
        return obj.getClass() == NoteINR500.class && ((NoteINR500) obj).getId() == this.id;
    }
}
