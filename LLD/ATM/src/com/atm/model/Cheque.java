package com.atm.model;

import java.awt.*;
import java.util.Date;

public class Cheque {
    int accountId ;
   int chequeID;
   Date dateOfIssue;
   Date dateOfExpiry;
   int ifscCode;
   Image signature;
   int amount;
   ChequeState state; // in proccess// valid // invalid// processed.  // will be accessed by Bank people
   int toAccountId;

   public Cheque(int accountId, int chequeID, Date dateOfIssue, Date dateOfExpiry, int ifscCode, Image signature, int amount, ChequeState state, int toAccountId) {
      this.accountId = accountId;
      this.chequeID = chequeID;
      this.dateOfIssue = dateOfIssue;
      this.dateOfExpiry = dateOfExpiry;
      this.ifscCode = ifscCode;
      this.signature = signature;
      this.amount = amount;
      this.state = state;
      this.toAccountId = toAccountId;
   }

   public int getAccountId() {
      return accountId;
   }

   public void setAccountId(int accountId) {
      this.accountId = accountId;
   }

   public int getChequeID() {
      return chequeID;
   }

   public void setChequeID(int chequeID) {
      this.chequeID = chequeID;
   }

   public Date getDateOfIssue() {
      return dateOfIssue;
   }

   public void setDateOfIssue(Date dateOfIssue) {
      this.dateOfIssue = dateOfIssue;
   }

   public Date getDateOfExpiry() {
      return dateOfExpiry;
   }

   public void setDateOfExpiry(Date dateOfExpiry) {
      this.dateOfExpiry = dateOfExpiry;
   }

   public int getIfscCode() {
      return ifscCode;
   }

   public void setIfscCode(int ifscCode) {
      this.ifscCode = ifscCode;
   }

   public Image getSignature() {
      return signature;
   }

   public void setSignature(Image signature) {
      this.signature = signature;
   }

   public int getAmount() {
      return amount;
   }

   public void setAmount(int amount) {
      this.amount = amount;
   }

   public ChequeState getState() {
      return state;
   }

   public void setState(ChequeState state) {
      this.state = state;
   }

   public int getToAccountId() {
      return toAccountId;
   }

   public void setToAccountId(int toAccountId) {
      this.toAccountId = toAccountId;
   }
}
