
// Reverse the array using two pointer technique.

import java.util.Scanner;
import java.util.Arrays;

public class ReverseArrayTP
{
    static int[] revArray(int[] arr)       // variable names inside main and method doesn't have to be same, only refrences/position and datatype should be same. here arr=partCopy
    {
        int left = 0;
        int right = arr.length-1;    // since we extrcted only useful part of array(i.e. user inputed part) and put it inside partCopy, so lenght of partCopy is actual length and its not entire length of arr that is 100.

        while(left<right)
        { 
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
 
            left++;
            right--;
            
        }

        return arr;
    }

    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[100];
        int count = 0;

        System.out.println("Please enter the numbers(enter 0 to stop): ");

        for(int i=0; i<a.length; i++)
        {
            int x = sc.nextInt();

            if(x==0)
            {
                break;
            }

            a[i] = x;
            count++;
        }

        if(count==0)
        {
            System.out.println("No Numbers Entered");
            sc.close();
            return;                                                  // program ends immidiately, if no input.
        }

        int[] partCopy = Arrays.copyOfRange(a, 0, count);      // we just copied that part of array which was occupied by user input and sent only that part for further process.
        System.out.print("Entered array is: ");
        System.out.println(Arrays.toString(partCopy));

        int[] result = revArray(partCopy);                           // since length of partCopy is count-1, we dont need to pass count again inside revArray, since we can simply use length of partCopy in place of count inside method, hence we didnt pass count inside method.

        System.out.print("Reversed Array is: ");
        System.out.println(Arrays.toString(result));

        sc.close();

    }
}