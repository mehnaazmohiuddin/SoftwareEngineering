package com.atm.model.note;

import com.atm.model.Currency;
import com.atm.model.Note;

public class Note1000INR  implements Note {
    double id;
    @Override
    public Currency getCurrency() {
        return Currency.INR;
    }
    @Override
    public double getId() {
        return id;
    }
    @Override
    public int getValue() {
        return 100;
    }

    public Note1000INR (){
        id = Math.random();
    }



}
