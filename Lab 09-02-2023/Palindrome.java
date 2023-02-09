package Lab;

import java.util.Scanner;

public class Palindrome {


	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String s, reversrStr=" ";
		System.out.println("Enter the String:");
		s = sc.nextLine();
		int stringLength = s.length();
		for (int i = stringLength-1; i>=0; --i)
		{
			 reversrStr = reversrStr+s.charAt(i);
		}
		if (s.equals(reversrStr))
		{
			System.out.println("It is a palindrome String");
		}
		else
		{
			System.out.println("It is not a polindrome String");
		}
		

	}

}
