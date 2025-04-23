class BankAccount {
    protected String accountNumber;
    protected String holderName;
    protected double balance;

    protected BankAccount(String accountNumber,String holderName,double balance){
        this.accountNumber=accountNumber;
        this.holderName=holderName;
        this.balance=balance;
    }

    public double calculateInterest(){
        return 0.0;
    }
}

