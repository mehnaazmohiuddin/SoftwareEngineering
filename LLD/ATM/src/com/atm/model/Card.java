package com.atm.model;

public class Card {
    String cardNumber;
    int maxCardLimit; // max limit the user can withdraw from atm.
    int ifsci; //to know which bank issued it.
    String encryptedPin;
    User owner;


    public String getCardNumber() {
        return cardNumber;
    }

    public int getMaxCardLimit() {
        return maxCardLimit;
    }

    public int getIfsci() {
        return ifsci;
    }

    public User getOwner() {
        return owner;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setMaxCardLimit(int maxCardLimit) {
        this.maxCardLimit = maxCardLimit;
    }

    public void setIfsci(int ifsci) {
        this.ifsci = ifsci;
    }

    public String getEncryptedPin() {
        return encryptedPin;
    }

    public void setEncryptedPin(String encryptedPin) {
        this.encryptedPin = encryptedPin;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }
}
