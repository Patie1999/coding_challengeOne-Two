import java.util.Arrays;
import java.util.Scanner;
public class coding_challenge {
    public static void main(String[] args) {

        //=== coding challenge One ===//
        System.out.println("coding challenge one begin :");

        //initialize an array of 30 integers
        int[] arrayOf30Numbers = new int[30];

        // generate 30 random integers and add them to an array
        generate_random_numbers.generateRandomNumbers(arrayOf30Numbers);

        // sort the array in ascending order
        Arrays.sort(arrayOf30Numbers);

        //print array elements
        for(int element: arrayOf30Numbers){
            System.out.println(element);
        }

        Scanner scanner = new Scanner(System.in);

        //Get input Integer
        System.out.println("Enter search key : ");
        int number = scanner.nextInt();

        //search for number input from user in the array
        binary_search.searchNumber(arrayOf30Numbers, number);

        System.out.println("coding challenge one end.");

        //=== code challenge two ===//

        System.out.println("coding challenge two begin :");
        //initialize an array of 10 integers
        int[] arrayOf10Numbers = new int[10];

        // generate 10 random integers and add them to an array
        generate_random_numbers.generateRandomNumbers(arrayOf10Numbers);

        // sort the array in ascending order
        Arrays.sort(arrayOf10Numbers);

        //print array elements
        for(int element: arrayOf10Numbers){
            System.out.println(element);
        }

        //Get input number one
        System.out.println("Enter search key One : ");
        int numberOne = scanner.nextInt();

        //Get input number two
        System.out.println("Enter search key Two : ");
        int numberTwo = scanner.nextInt();

        //search for two numbers inputted by user in the array
        //sum the two numbers
        //find the factorial of the sum
        if(binary_search.searchForTwoNumbers(arrayOf10Numbers, numberOne, numberTwo)==true){
            int sum = summation.SumTwoNumbers(numberOne, numberTwo);
            System.out.println("The sum of "+numberOne+" and "+numberTwo+" is : "+sum);
            factorial.factorialOfNumber(sum);
        }else {
            System.out.println(numberOne+" or "+numberTwo+" or both were not found in the array!");
            System.out.println("hence sum was not calculated");

        }
 
        System.out.println("coding challenge two end.");
    }
} 