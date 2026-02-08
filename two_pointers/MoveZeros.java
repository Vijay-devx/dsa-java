
// Move all Zeros to the End

import java.util.Scanner;
import java.util.Arrays;

public class MoveZeros 
{
    static int[] zeroMoveTP(int[] arr, int n)
    {
        int write = 0;
        
        for(int read=0; read<n; read++)     // read will move everyturn, write will move only if there's a non zero value.
        {
            if(arr[read] !=0)
            {
                arr[write] = arr[read];

                write++;
            }
        }

         while(write<n)         //we will fill the remaining space with zero, since after first loop write will be at position beyond which there won't be any cells having non zero values, so we will fill those cells with zero.
            {
                arr[write] = 0;

                write++;
            }

        return arr;

    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter length of string: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter elements of array: ");
        
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("you have entered: "+Arrays.toString(arr));

        int[] result = zeroMoveTP(arr, n);

        System.out.println("result: "+Arrays.toString(result));

        sc.close();

    }
    
}
