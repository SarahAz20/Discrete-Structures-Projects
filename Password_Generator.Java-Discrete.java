
import java.util.Scanner;
import java.util.Random;
public class Password_Generator {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        //randomly generated psw
        //the number of possible passwords given the constraints
        //random()

        String passwords = "";
        long possiblePsw;

       Random oRandom = new Random();

        // 1st character must be a digit, 10 possibilities for 1st position
        possiblePsw = 10;

        for (int i = 1; i < 8; i++){

            possiblePsw *= 40;

        }
        //calculating the remaining positions, each (10*40)^7
        //remaining character can be digits (10), special characters (4)
        // OR lower case letters (26). 10+4+26=40.


        char [] SpecialCharacters = { '*', '&', '$', '#' };
        int [] Digits = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        char [] letters = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n',
                'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };

        passwords += Digits[oRandom.nextInt(Digits.length)];


        for (int i =0; i<7; i++){
            int choice = oRandom.nextInt(Digits.length + letters.length + SpecialCharacters.length);
            if (choice < Digits.length){
                passwords += Digits[choice];

            }
            else {
                choice -= Digits.length;
                if (choice <letters.length){
                    passwords += letters[choice];

                }
                else {
                    choice -= letters.length;
                    passwords += SpecialCharacters[choice];
                }
            }
        }

        System.out.println("This is the number of possible passwords: " + possiblePsw);

        System.out.println("This is the randomized passwords: " + passwords);

    }





}
