 class SavingAccount extends BankAccount {
    private double interestRate;
    protected SavingAccount(String accountNumber, String holderName, double balance, double interestRate){
        super(accountNumber, holderName, balance);
        this.interestRate=interestRate;
     }

     @java.lang.Override
     public double calculateInterest() {
         return (balance * interestRate)/100;
     }
     public void displayAccountDetails(){
         System.out.println("Saving account Holder: "+holderName);
         System.out.println("Interest:  "+calculateInterest());
     }
 }
