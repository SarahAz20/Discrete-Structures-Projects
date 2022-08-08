import java.util.Scanner;
public class Recursive {
    public static void main(String[] args) {
        Scanner scnr = new Scanner (System.in);
        System.out.println("Enter an integer to compute its own power");
        int userInput = scnr.nextInt();
        System.out.println(userInput+ "^" + userInput+ " = " + power(userInput, userInput));
    }
    public static int power(int base, int exponent){
        if(exponent > 0){
            return base*power(base, exponent-1);
        }
        else{
            return 1;
        }

    }
}
