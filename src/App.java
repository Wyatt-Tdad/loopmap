import java.util.Scanner;
import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Enter the required size of the array. ::" );
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int myArray[] = new int [size];
        int sum = 0;
        int product = 1;
        int max = myArray[0];
        int min = myArray[0];
        
        System.out.println("Enter the elements of the array one by one ");
        for (int i=0; i<size; i++){
            myArray[i] = s.nextInt();
            sum = sum + myArray[i];
            product = product * myArray[i];
            min = Math.min(min, myArray[i]);
            max = Math.max(max, myArray[i]);
        }
        System.out.println("Contents of the array are: "+ Arrays.toString(myArray));
        System.out.println("Sum of the array are: "+ sum);
        System.out.println("Product of the array are: "+ product);
        System.out.println("Max "+ max);
        System.out.println("Min "+ min);
    }
}
