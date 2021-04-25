package StringManipulations;

import java.util.Scanner;

public class StringMinimize {

	public static void main(String[] args) 
	{
		System.out.println("Enter input string: ");
		Scanner scan = new Scanner(System.in);
		String strInput = scan.nextLine();
		System.out.println("Length of minimized string is ' " + minimumLength(strInput) + " '");
	}

	private static int minimumLength(String strInput) 
	{
		int maxOccu = 0;
		int arr[] = new int[26];
		int n = strInput.length();
		
		for(int i = 0; i < n; i++)
			arr[strInput.charAt(i) - 'a']++;
		
		for(int i = 0; i < 26; i++)
			if( arr[i] > maxOccu)
				maxOccu = arr[i];
		
		return (n - maxOccu);
	}

}
