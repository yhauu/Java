package app;

public class TestClass{
    public static void main (String args[]){
        //Referêsncia para a classe conta
        Account acTest1 = new Account(9876, 234567);
        Account acTest2 = new Account(3475, 857380);

        acTest1.deposit(200.00);
        System.out.println("Your balance is: " + acTest1.getBalance());

        boolean drawOutTest = acTest1.drawOut(50);
        if (drawOutTest){
            System.out.println("Now, your balance is: " + acTest1.getBalance());
        } else {
            System.out.println("Your balance is insufficient");
        }

        boolean tranferTest = acTest1.transfer(50, acTest2);
        if (tranferTest){
            System.out.println("Balance of account two is: " + acTest2.getBalance());
            System.out.println("Balance of account one is: " + acTest1.getBalance());
        } else {
            System.out.println("Your balance is insufficient");
        }

        //Referência para a classe Cliente
        Client client = new Client();

        acTest1.setHolder(client);
        acTest1.getHolder().setName("Fabricio");
        System.out.println("Teste Holder: " + acTest1.getHolder().getName());

        //Referência para a classe Conta-corrente
    }
}