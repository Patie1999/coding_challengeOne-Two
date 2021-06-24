import java.util.Random;
public class generate_random_numbers {
    
    // generate random numbers and add them to the array
    public static void generateRandomNumbers(int[] array){
        Random random = new Random();
        for(int i=0; i<array.length; i++){
            array[i] = random.nextInt(100);
        }
    }
}
