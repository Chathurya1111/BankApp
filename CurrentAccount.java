class CurrentAccount extends BankAccount {
    private double overdraftLimit;
    protected CurrentAccount(String accountNumber, String holderName, double balance, double overdraftLimit){
        super(accountNumber,holderName,balance);
        this.overdraftLimit=overdraftLimit;
    }

    @java.lang.Override
    public double calculateInterest() {
        return balance+overdraftLimit;
    }

    public void displayAccountDetails(){
        System.out.println("Current Account Holder's Name: "+holderName);
        System.out.println("Interest: "+calculateInterest());
    }
}
