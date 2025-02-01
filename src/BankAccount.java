public class BankAccount{

    // work area
    public static void main(String[] args) {

        String name = "Bob";
        double balance1 = 2175.37; // Initial balance
        double balance2 = balance1 - 302.50; // Withdrew 302.50
        float balance3 = (float) balance2 + (float) 50.03; // Deposited 50.03
        float balance4 = (float) balance3 / 2 + 20; // Withdrew half his balance then deposited 20
        float balance5 = (float) balance4 - 1; // Withdrew 1
        float balance6 = (float) balance5 * 2; // Deposited double his paycheck
        float balance7 = (float) balance6 + 1; // Deposited 1

        System.out.println(name + " has a new balance of: " + balance7);

    }

}
