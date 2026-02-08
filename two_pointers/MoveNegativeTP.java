
// Move all Negative Numbers to the Left.

import java.util.Scanner;
import java.util.Arrays;

public class MoveNegativeTP 
{
    static int[] negativeMove(int[] arr, int n)
    {
        int left = 0;
        int right = n-1;

        while(left<right)
        {
            if(arr[left]<0)
            {
                left++;
                 continue;
            }
            else if( arr[right]>=0)
            {
                right--;
                continue;
            }
            else
            {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
        }

        return arr;
         
   
    }


    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the no of elements in array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Please enter the elements of array: ");
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("You have entered: "+Arrays.toString(arr));

        System.out.println("result = "+Arrays.toString(negativeMove(arr,n)));

        sc.close();
    }
    
}
