
// TWO SUM Unsorted

import java.util.Scanner;
import java.util.Arrays;

public class TwoSumBubbleSort 
{
    static boolean sortedTwoSum(int[] arr, int n, int target)
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
            else if(sum<target)
            {
                left++;
            }
            else if(sum>target)
            {
                right--;
            }
        }

        return false;
    }
    
    static int[] arraySort(int[] arr, int n)    //we did bubble sorting of our unsorted array.
    {

        for(int i=0; i<n-1; i++)                // n-1 because last element automatically falls into place, so we dont need to sort for that element
        {
            for(int j=0; j<n-1-i; j++)          // n-1-i because 1. n-1 is compulsary, as we are comparing j with j+1, so if its just j<n it will become out of bounds, as there is no next value to compare. and since after every iteration, last element is getting fixed, so we do n-1-i to avoid unnecessary runs.
            {
                if(arr[j]>arr[j+1])             // we swap if true;
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
            
                }
            }
        }

        return arr;
    }
    

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number of elements in the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Please enter the elements of array: ");
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("Please enter the target target value: ");
        int target = sc.nextInt();

        System.out.println("the entered array is: "+Arrays.toString(arr));
     
        arraySort(arr,n);
        System.out.println("sorter array is: "+Arrays.toString(arr));

        boolean result = sortedTwoSum(arr,n,target);

        if(result==true)
        {
            System.out.println("Found");
        }
        else
        {
            System.out.println("NOT Found");
        }

        sc.close();
    }
    
}
