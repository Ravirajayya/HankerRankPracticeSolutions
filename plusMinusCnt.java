/* Given an array of integers, calculate the ratios of its elements that are positive, 
 * negative, and zero. Print the decimal value of each fraction on a new line with  
 * 6 places after the decimal. */
import java.util.Scanner;
import java.util.stream.IntStream;

public class PlusMinus 
{
	static int temp;
	
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Eter the length of array: ");
		int tmpNum = scan.nextInt();
		int[] arr = new int[tmpNum];
		temp = arr.length;
		
		System.out.println("Enter data on array");
		for(int i = 0; i < tmpNum; i++)
			arr[i] = scan.nextInt();
		
		plusMinus(arr);
	}
	
	// Complete the plusMinus function below.
    static void plusMinus(int[] arr)
    {
        print(IntStream.of(arr).filter(x -> x > 0).count());
        print(IntStream.of(arr).filter(x -> x < 0).count());
        print(IntStream.of(arr).filter(x -> x == 0).count());
    }
    
    static void print(float tmp)
    {
    	System.out.println(String.format("%.6f", (float)tmp/temp));
    }
}
