

## Requirements of ATM System ##

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
* Balance 
* Funds. // i guess not needed. 
* Card.
* ATMSystem.
* Registry [which tells which ifsci means which bank. so that we can ask the exact bank.]
* Notes
* Note500
* Note200 
* Cash // perhaps will not use. 



# User                
- Name 
- Card  # has info like account number , bank name. perpahs ifsc. 
- Cheque
- List<Notes>

# Bank [Interface]
*  [getName , setName]
* boolean authenticateUser(BankUser user) // need to verify pin
* float getBalance (BankUser user)
* boolean addAmount(BankUser user, int amount)
* boolean withdrawAmount(BankUser user, int amount)
* boolean authenticateAccount(BankUser user) // no need to verify pin
* boolean depositCheque(BankUser user); // 
* boolean validateCheque(BankUser user); [sets the state of the cheque in progress etc ]
* 
*
# Cash [Class]  // this could be paper or coins or other de
  * setAmount(ArrayList<Notes> notes);
  * ArrayList<Notes> getAmount();
# Cheque 
  * int AccountId ; 
  * int chequeID;
  * Date dateOfIssue;
  * Date dateOfExpiry;
  * int ifscCode;
  * Image signature; 
  * int amount;
  * ChequeState state; // in proccess// valid // invalid// processed.  // will be accessed by Bank people
  * int toAccountId; 

#



