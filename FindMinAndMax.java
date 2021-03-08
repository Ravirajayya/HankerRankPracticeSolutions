/* Find Minimum and maximum sum of elements in the given array */
import java.util.stream.IntStream;

public class FindMinAndMax
{
	public static void main(String[] args) 
	{
		int[] arr = {3, 4, 5, 1, 2};
    	System.out.println(IntStream.of(arr).sorted().distinct().limit(4).sum());
	}
}