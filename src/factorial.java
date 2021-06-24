public class factorial {

    // calculate the factorial of a number
    public static void factorialOfNumber(int number){
        if(number==0 && number==1){
            System.out.println("The factorial of number "+number+" is : "+1);
        }
        int factorial = number;
        for(int i=number-1; i>0; i--){
            factorial = factorial * i;
        }
        System.out.println("The factorial of number "+number+" is : "+factorial);
    }
}
