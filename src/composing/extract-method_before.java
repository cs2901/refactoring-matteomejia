package composing;

public class Print {
    void printOwing(){
        printBanner();
        // Print details.
        printDetails(){
            System.out.println("name: " + name);
            System.out.println("amount: " + getOutstanding());
        }
    }
}