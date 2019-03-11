public class Main {

    public static void main(String[] args) {

        Banking client = new Banking();

        client.setAccountHolder("Sameer Khan");
        client.setAccountNumber("1983745NP0334");
        client.setHolderType("VIP");
        client.setBalance(203485d);     // d is for double type indication.

        System.out.println("Client Name: " + client.getAccountHolder());
        System.out.println("Account Number: " + client.getAccountNumber());
        System.out.println("Type: " + client.getHolderType());
        System.out.println("Remaining Balance: " + client.getBalance());
        System.out.println("----After Transaction----");

        client.depositAmount(15000d);
        client.withdrawAmount(2100.87);

        System.out.println("Ultimate Balance: " + client.getBalance());
    }
}
