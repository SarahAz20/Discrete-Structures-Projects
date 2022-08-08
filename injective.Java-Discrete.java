import java.util.Scanner;
public class injective {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int userInput;
        int arrayA[] = new int[100];
        int arrayB[] = new int[100];

        System.out.println("Which function do you want to test");
        System.out.println("1. Z-->Z: t(x) = 3x");
        System.out.println("2. Z-->Z:t(x) = x^2");
        System.out.println("3. Z-->Z: t(x) = 2x - 2");

        userInput = scnr.nextInt();

        for (int i = 1; i <= 100; i++) {
            arrayA[i - 1] = i;
            if (userInput == 1) {
                arrayB[i - 1] = 3 * i;
            } else if (userInput == 3) {
                arrayB[i - 1] = 2 * i - 2;
            } else if (userInput == 2) {
                arrayB[i - 1] = i * i;
            } else {
                arrayB[i - 1] = arrayA[i - 1];
            }
            System.out.println("t(" +i + ") = " + arrayB[i - 1]);

        }
        if (injectiveChecker(arrayB)) {
            System.out.println("Function is injective");
        }
        else {
            System.out.println("Function is not injective");
        }
    }
        public static boolean injectiveChecker(int array[]){
            for (int j =0; j<array.length-1; j++){
                for (int i=j+1; i<array.length; i++){
                    if (array[j]==array[i]){
                        return false;

                    }
                }
            }
            return true;

        }
    }

