
// Determine whether given array of integers is palindrome.

import java.util.Scanner;

public class PalindromeTP 
{
    static void intPalindromeTP(int[] arr, int count)
    {
        int left = 0;
        int right = count-1;

        while(left<right)
        {
            if(arr[left] != arr[right])
            {
                System.out.println("NOT Palindrome");
                return;
            }
            else
            {
                left++;
                right--;
            }
        }

        System.out.println("Palindrome");     // if loop finishes, its a palindrome, otherwise if there is mismatch, loop returns immidiately without reaching this point.

    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        int count = 0;

        System.out.println("Please enter the Elements of Array(press 0 to stop): ");
        for(int i = 0; i<arr.length; i++)
        {
            int x = sc.nextInt();

            if(x==0)
            {
                break;
            }
            
            arr[i] = x;
            count++;
        }
        if(count==0)
        {
            System.out.println("No Elements Entered.");
        }
        else
        {
            intPalindromeTP(arr, count);
        }

        sc.close();


    }
    
}
