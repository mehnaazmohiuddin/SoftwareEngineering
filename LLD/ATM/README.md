

# Requirements of ATM System #

* The user should be able to swipe card.
* The user should be able to withdraw funds from account of any bank. 
* The user should be able to deposit cash and cheque. [done]
* The user should be able to transfer funds. 
* The user should be able to check the balance.  [done]




How to go about? <br/>
Collect the nouns.  <br/>

* User
* Bank
* Cheque 
* Balance // no need. but its a noun int 
* Funds. // i guess not needed. its a noun int.
* Card.
* ATMSystem.
* Registry [which tells which ifsc means which bank. so that we can ask the exact bank.]
* Notes
* Note500
* Note200 
* Cash // perhaps will not use. 



## User                
- Name 
- Card  # has info like account number , bank name. perpahs ifsc.  # will have to remove this. 
- Cheque
- List<Notes> #isApattern

## Bank [Interface]  isA pattern
*  [getName , setName]
* boolean authenticateUser(User user, Card c) // need to verify pin
* float getBalance (User user)
* boolean addAmount(User user, int amount)
* boolean withdrawAmount(User user, int amount) throws InvalidUserException , InsufficientFunds, WithdrawalLimitReached, AccountBlockedError , 
* boolean authenticateAccountForDeposit(User user) // no need for pin
* boolean depositCheque(User user, Cheque cheque); // 
* boolean validateCheque(User user, Cheque cheque); [sets the state of the cheque in progress etc ]
* boolean private validateCard(BankUser user, Card c); [sets the state of the cheque in progress etc ]

## Cash [Class]  // this could be paper or coins or other de
  * setAmount(ArrayList<Notes> notes);
  * ArrayList<Notes> getAmount();
## Cheque 
  * int AccountId ; 
  * int chequeID;
  * Date dateOfIssue;
  * Date dateOfExpiry;
  * int ifscCode;
  * Image signature; 
  * int amount;
  * ChequeState state; // in proccess// valid // invalid// processed.  // will be accessed by Bank people
  * int toAccountId; 

## Card
* String  cardNumber;
* int maxCardLimit; // max limit the user can withdraw from atm. 
* int ifsci ; //to know which bank issued it. 
* String encryptedPin;
* User owner;

## Registry
    * HashMap of ifsc to Bank Objects. 
       String getBank(int ifsc) 
        
## ATMSystem.
     - CashDischarger cashDischarger;
     - Registry registry ; has a refrence to registry.
    * boolean validateCard( Card card, String pin ) ->// swipe card.     calls registry then to sends card details to bank for validation.
    * boolean depositMoney(Card card , List<Note> notes, String phoneNo);
    * List<Note> withdrawMoney(Card card , String pin);
    * getBalance(Card card);
    * boolean transferFunds(Card card , String pin , String accountIdToTransfer, String phoneNumber);
    * boolean depositeCheque(Cheque checque);
    * boolean fillATM(List<Note> notes);



 ## CashDischarger 
   ### apply chain of responsibility principle
   try 2000 notes, rest try 1000 notes rest try 500 notes 
   try 100 notes else finally cant process this request.
   
    Notes2000Dispatcher implements CashDischarger 
    Notes1000Dispatcher implements CashDischarger 
    Notes500Dispatcher implements CashDischarger
    Notes100Dispatcher implements CashDischarger



Keytake aways

keep instance in singleton as volatile.









    
