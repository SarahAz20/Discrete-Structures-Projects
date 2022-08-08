import java.util.Scanner;
public class Sets {

    public static void main(String[] args) {
        Scanner scnr = new Scanner (System.in);
        int setSize1;
        int setSize2;
        int readValues;

        int [] setOne;
        int [] setTwo;

        int [] universal = new int [100];
         for (int i=0; i<100; i++){
             universal [i] = i+1;

         }

        System.out.println("What is the size of the first set you want to start with");
         setSize1 = scnr.nextInt();

        System.out.println("What is the size of the second set you want to start with");
        setSize2 = scnr.nextInt();

        setOne = new int [setSize1];
        setTwo = new int [setSize2];

        System.out.println("Which values are in the first set?");

        for (int i = 0; i<setSize1; i++ ){

            readValues = scnr.nextInt();
            setOne[i] = readValues;
        }
        System.out.println("Which values are in the second set?");

        for (int i = 0; i<setSize2; i++ ){

            readValues = scnr.nextInt();
            setTwo[i] = readValues;
        }
        System.out.print("Union: ");
        union (setOne, setTwo);
        System.out.print("Intersection: ");
        intersection (setOne, setTwo);
        System.out.print("Difference (set 1 - set 2): ");
        difference (setOne, setTwo);
        System.out.print("Complement of set 1: ");
        difference (universal, setOne);
        System.out.print("Cartesian Product (set 1 x set 2): ");
        cartesianProduct (setOne, setTwo);
        System.out.print("Power sets of set 1: ");
        powerSets (setOne);

    }

    public static boolean setChecker (int [] array, int value){

        for (int j=0; j<array.length; j++){

            if (array[j]==value){
                return true;
            }
        }
        return false;
    }

    public static void union (int [] array1, int[] array2){
        int arraylist[] = new int [array1.length+array2.length];
        int size = 0;
        for(int i=0; i<array1.length;i++){
            arraylist[i] = array1[i];
            size++;
        }
        for(int i=0; i<array2.length;i++) {

            if(setChecker(array1, array2[i]) == false){
                arraylist[size] = array2[i];
                size++;
            }
        }

        int finalUnionArray[] = new int [size];
        for (int i=0; i<size; i++){
            finalUnionArray[i] = arraylist[i];
         System.out.print(arraylist[i] + " ");
        }
        System.out.println();

    }
    public static void intersection (int [] array1, int[] array2){
        int arraylist[] = new int [array1.length+array2.length];
        int size = 0;

        for(int i=0; i<array2.length;i++) {

            if(setChecker(array1, array2[i]) == true){
                arraylist[size] = array2[i];
                size++;
            }
        }

        int finalIntersectionArray[] = new int [size];
        for (int i=0; i<size; i++){
            finalIntersectionArray[i] = arraylist[i];
            System.out.print(arraylist[i] + " ");
        }
        System.out.println();

    }
    public static void difference (int [] array1, int[] array2){
        int arraylist[] = new int [array1.length];
        int size = 0;

        for(int i=0; i<array1.length;i++) {

            if(setChecker(array2, array1[i]) == false){
                arraylist[size] = array1[i];
                size++;
            }
        }

        int finalDifferenceArray[] = new int [size];
        for (int i=0; i<size; i++){
            finalDifferenceArray[i] = arraylist[i];
            System.out.print(arraylist[i] + " ");
        }
        System.out.println();

    }

    public static void cartesianProduct (int [] array1, int[] array2) {
        for (int i=0; i<array1.length; i++){
            for (int j=0; j<array2.length; j++)

                System.out.print("(" +array1[i] + ", " + array2[j] + ") ");


        }
        System.out.println();

    }

    public static void powerSets (int [] array1) {
         int powerSetSize = (int) (Math.pow(2, array1.length));

         for (int i=0; i<powerSetSize;i++){
             System.out.print("[ " );
             for (int j=0; j<array1.length; j++){
                 if ((i>>j) %2 ==1){
                     System.out.print(array1[j] + " ");
                 }


             }
             System.out.print("]");

         }
          System.out.println();



    }




}
