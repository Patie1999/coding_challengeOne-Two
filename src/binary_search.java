import java.util.Arrays;
public class binary_search {

    // search for any two numbers of return true if both numbers are present in the array else false
    public static boolean searchForTwoNumbers(int[] array, int numberOne, int numberTwo){

        return(Arrays.binarySearch(array, numberOne)>=0 && Arrays.binarySearch(array, numberTwo)>=0);
    }

    // secrch for a number in the array
    public static void searchNumber(int[] array, int number){

        int result = Arrays.binarySearch(array, number);

        if (result < 0){
            System.out.println("The number "+number+"is not in the array!");  
        }else{
            System.out.println("The number "+number+" is found at index: "+result);  
        }
    }
}
