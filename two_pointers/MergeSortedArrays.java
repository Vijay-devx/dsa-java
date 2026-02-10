
// Merge Two Sorted Arrays.

import java.util.Scanner;
import java.util.Arrays;

public class MergeSortedArrays 
{
    static int[] arrayMerge(int[] arr1, int[] arr2, int m, int n)
    {
        int x = m + n;
       
        int[] merge = new int[x];

        int i = 0;    // arr1 pointer
        int j = 0;    // arr2 pointer
        int k = 0;    // merged array pointer

        while(i<m && j<n)
        {
            if(arr1[i]<=arr2[j])
            {
                merge[k] = arr1[i];
                i++;
            }

            else
            {
                merge[k] = arr2[j];
                j++;
            }

            k++;
        }

        while(i<m)
        {
            merge[k] = arr1[i];
            k++;
            i++;
        }

        while(j<n)
        {
            merge[k] = arr2[j];
            k++;
            j++;
        }

        return merge;

    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the no of elements in 1st and 2nd array: ");
        int m = sc.nextInt();
        int n = sc.nextInt();

        int[] arr1 = new int[m];
        int[] arr2 = new int[n];

        System.out.println("Please enter the elements of 1st array: ");
        
        for(int i=0; i<m; i++)
        {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Please enter the elements of 2nd array: ");

        for(int i=0; i<n; i++)
        {
            arr2[i] = sc.nextInt();
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int[] Result = arrayMerge(arr1, arr2, m, n);

        System.out.println("Merged array: "+Arrays.toString(Result));

        sc.close();
    }
    
}
