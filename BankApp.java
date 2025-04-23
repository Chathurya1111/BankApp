public class BankApp {
    public static void main(String[] args) {
        SavingAccount sa=new SavingAccount("SA001","Anjali",100000,50);
        CurrentAccount ca=new CurrentAccount("CA001","Sunil",50000,20000);

        sa.displayAccountDetails();
        ca.displayAccountDetails();

    }
}
