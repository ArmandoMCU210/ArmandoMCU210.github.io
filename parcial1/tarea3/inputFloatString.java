import java.util.Scanner;

public class inputFloatString {

class Input {
    public static void main(String[] args) {
    	
        try (Scanner num = new Scanner(System.in)) {
            // Getting float input
            System.out.print("Enter float: ");
            float myFloat = num.nextFloat();
            System.out.println("Float entered = " + myFloat);
            
            // Getting double input
            System.out.print("Enter double: ");
            double myDouble = num.nextDouble();
            System.out.println("Double entered = " + myDouble);
            
            // Getting String input
            System.out.print("Enter text: ");
            String myString = num.next();
            System.out.println("Text entered = " + myString);
        }
    }
}

}
