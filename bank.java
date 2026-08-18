
class bank {

    String bankName;
    int userid;
    String userName;
    long accountNumber;
    String accountType;
    double accountBalance;

    bank(int userid, String userName, long accountNumber, String accountType, double aaccountBalance) {
        this.userid = userid;
        this.userName = userName;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.accountBalance = aaccountBalance;
    }

    void displayBankDetails() {
        System.out.println("Bank Name: " + bankName);
    }

    void displayUserDetails() {
        System.out.println("User ID: " + userid);
        System.out.println("User Name: " + userName);
    }

    void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Type : " + accountType);
        System.out.println("Account Balance: " + accountBalance
        );
    }

    public static void main(String[] args) {
        bank b1 = new bank(01, "Revanth", 123456789045l, "Savings", 19999);
        b1.displayUserDetails();
        b1.displayAccountDetails();

    }
}
