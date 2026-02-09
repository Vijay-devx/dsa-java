
/* Problem: 
   Given a sorted array of integers and a target sum, check whether there exists a pair of elements whose sum equals the target.
   
   input: n, sorted array, target 
   output: Found / Not Found


   logic:

   if, smallest+largest is too small -> increase the smallest
   if smallest+largest is loo large  -> reduce the largest
*/

import java.util.Scanner;

public class TwoSumSorted 
{
    static boolean twoSum(int[] arr, int target, int n)
    {
        int left = 0;
        int right = n-1;

        while(left<right)
        {
            int sum = arr[left]+arr[right];
            
            if(sum==target)
            {
                return true;
            }
            else if(sum<target)                  // if after combining smallest number that is arr[left] with largest number that is arr[right], sum<target, then any other pair involving arr[left] will be lesser than target, hence we increase left, that's left++;
            {
                left++;
                continue;
            }

            else if(sum>target)                  // if after combining largest number that is arr[right] with smallest number thats arr[left], sum>target, then any other pair involving arr[right] will be larger than target, hence we reduce the arr[right] i.e. right--;
            {
                right--;
                continue;
            }
        }

        return false;                           // return false if the loop exits without finding target sum.

    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the no of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Please enter elements of sorted array: ");
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("Please enter the target sum: ");
        int target = sc.nextInt();

        boolean result = twoSum(arr, target, n);

        if(result == true)
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
