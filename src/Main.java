import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int[] intArray = {17,  166,  288,  324,  531,  792,  946,  157,  276,  441, 533, 355, 228, 879, 100, 421, 23, 490, 259, 227,
            216, 317, 161, 4, 352, 463, 420, 513, 194, 299, 25, 32, 11, 943, 748, 336, 973, 483, 897, 396,
            10, 42, 334, 744, 945, 97, 47, 835, 269, 480, 651, 725, 953, 677, 112, 265, 28, 358, 119, 784,
            220, 62, 216, 364, 256, 117, 867, 968, 749, 586, 371, 221, 437, 374, 575, 669, 354, 678, 314, 450,
            808, 182, 138, 360, 585, 970, 787, 3, 889, 418, 191, 36, 193, 629, 295, 840, 339, 181, 230, 150};

    static int toFind = -1;

    static int comparison = 0;

    public static void main(String[] args){
        Boolean isNum = false;

        while(!isNum){
            System.out.println("Choose a whole number between 1 and 1000:");
            isNum = getInt(new Scanner(System.in));
        }

        printArray();

        int result = linearSearch(intArray, toFind);
        if (result == -1){
            System.out.println("\n" + toFind + " was not found.");
        } else {
            System.out.println("\n" + toFind + " was found at index " + result + " after " + comparison + " comparisons.");
        }
        comparison = 0;

        int result2 = bubbleSort();
        System.out.println("\n" + result2 + " swaps to sort the list.");

        printArray();

        int result3 = binarySearch(intArray, toFind);
        if (result3 == -1){
            System.out.println("\n" + toFind + " was not found in the sorted list" + " after " + comparison + " comparisons.");
        } else {
            System.out.println("\n" + toFind + " was found at index " + result3 + " after " + comparison + " comparisons.");
        }
        comparison = 0;
    }

    public static boolean getInt(Scanner choice){
        try{
            toFind = choice.nextInt();
            if(toFind <= 0 || toFind > 1000) {
                return false;
            }
        } catch (Exception e){
            return false;
        }
        return true;
    }

    public static int linearSearch(int[] haystack, int needle){
        int index = -1;
        for (int i = 0; i < haystack.length; i++){
            ++comparison;
            if (haystack[i] == needle){
                index = i;
                break;
            }
        }
        return index;
    }

    public static int bubbleSort(){
        int swaps = 0;
        boolean sorted = false;
        while (!sorted){
            sorted = true;
            for (int i = 1; i < intArray.length; i++){
                int a = intArray[i - 1];
                int b = intArray[i];
                if (a > b){
                    intArray[i - 1] = b;
                    intArray[i] = a;
                    swaps++;
                    sorted = false;
                }
            }
        }
        return swaps;
    }

    public static int binarySearch(int[] haystack, int needle){
        int index = -1;
        int low = 0;
        int high = haystack.length - 1;
        int half = (low + high) / 2;

        while(low <= high){
            if (haystack[half] == needle) {
                index = half;
                return index;
            } else if (haystack[half] > needle) {
                high = half - 1;
            } else {
                low = half + 1;
            }
            half = (low + high) / 2;
            comparison++;
        }
        return index;
    }

    public static void(){
        System.out.print("\n");
        for (int n : intArray) {
            if(intArray[intArray.length - 1] == n){
                System.out.print(n + ".\n");
            }
            else{
                System.out.print(n + ", ");
            }
        }
    }
}
