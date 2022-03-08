public class Test {
    
    public static void main(String []args){
        BankAccount client1 = new BankAccount(850 , 400);
        BankAccount client2 = new BankAccount(500 , 200);
        BankAccount client3 = new BankAccount(200 , 600);
        client1.depositeCheck(100);
        client1.withdrawCheck(500);
        client1.withdrawCheck(700);
        client1.display();
        client2.display();
        client3.display();
        System.out.println(BankAccount.getCounter());
    }
}
