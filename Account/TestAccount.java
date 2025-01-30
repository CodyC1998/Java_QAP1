package Account;
public class TestAccount {
    public static void main(String[] args) {
         Account acc1 = new Account("1", "John Doe", 5000);
         Account acc2 = new Account("2", "Jane Smith", 4000);

         // Display initial balances
        System.out.println("Initial Balances:");
        System.out.println(acc1.getName() + "'s balance: $" + acc1.getBalance());
        System.out.println(acc2.getName() + "'s balance: $" + acc2.getBalance());

        // Transfer $100 from accoount 1 to account 2
        System.out.println("\nTransferring $1000 from " + acc1.getName() + " to " + acc2.getName());
        acc1.transferTo(acc2, 1000);

        // Display updated balances
        System.out.println("\nUpdated Balances:");
        System.out.println(acc1.getName() + "'s balance: $" + acc1.getBalance());
        System.out.println(acc2.getName() + "'s balance: $" + acc2.getBalance());
    }
}
