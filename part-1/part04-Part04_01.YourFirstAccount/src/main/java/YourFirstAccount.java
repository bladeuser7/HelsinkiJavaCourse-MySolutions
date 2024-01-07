public class YourFirstAccount {
    

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // Write your program here
        
       
        Account manosAccount = new Account("Manos account", 100.0);

        System.out.println("Initial state");
        System.out.println(manosAccount);
        
        manosAccount.deposit(20);


        System.out.println("End state");
        System.out.println(manosAccount);
    }
    

}
