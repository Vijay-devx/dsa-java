
// Pair with Given Difference
/*
   Problem:
   Given a sorted array of integers and an integer k, check if there exists a pait(i,j) such that:
   arr[j] - arr[i] = k 

   input : n, sorted array, k
   output: Found/Not Found

*/

import java.util.Scanner;
import java.util.Arrays;

public class PairWithDifference 
{
    static boolean pairWithDifference(int[] arr, int n, int target)
    {
        Arrays.sort(arr);

        int left = 0;
        int right = 1;
        
        while(right<n)
        {
            int diff = arr[right]-arr[left];

            if(diff==target)
            {
                return true;
            }
            else if(diff<target)
            {
                right++;
            }
            else if(diff>target)
            {
                left++;
            }
        }

        return false;

    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the no. of elements in array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Please enter the elements of array: ");
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("Please enter the target difference value: ");
        int target = sc.nextInt();

        System.out.println("Array You have entered: "+Arrays.toString(arr));

        boolean result = pairWithDifference(arr,n,target);

        if(result==true)
        {
            System.out.println("Found");
        }
        else
        {
            System.out.println("Not Found");
        }

        sc.close();

    }
    
}
