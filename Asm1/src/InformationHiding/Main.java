package InformationHiding;

public class Main {
    public static void main(String[] args) {
        System.out.println("********* Abstraction **********");
        Shape circle = new Circle(6);
        System.out.println("Area of Circle: " + circle.area());


        System.out.println("********* Reduced Complexity **********");
        BankAccount account = new BankAccount(1000);
        account.deposit(600);  // User doesn't know the validation logic
        account.withdraw(300);
        System.out.println("Final Balance: " + account.getBalance());


        System.out.println("********* Improved Security **********");
        SecureData secureData = new SecureData("Manh2004");
        System.out.println("Decrypted Data: " + secureData.getData());
    }
}

















