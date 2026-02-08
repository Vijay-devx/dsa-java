
// Determine whether the given string is Palindrome or not?

import java.util.Scanner;

public class StringPalindromeTP 

{
    static boolean paliStringTP(String s)
    {
        boolean isPali = true;
        int left = 0;
        int right = s.length()-1;

        s = s.toLowerCase();                   // To make it case-insensitive.

        while(left<right)
        {
            if(s.charAt(left) != s.charAt(right))
            {
                isPali = false;
                break;
            }
            else
            {
                left++;
                right--;
            }
        }

        return isPali;

    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the string: ");
        String s = sc.next();
        

        System.out.println("You have entered: "+s);

        boolean result =paliStringTP(s);

        if(result == false)
        {
            System.out.println("Its NOT a Palindrome.");
        }
        else
        {
            System.out.println("Its a Palindrome.");
        }

        sc.close();
    }
    
}
