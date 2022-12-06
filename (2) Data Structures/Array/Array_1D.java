//Program on 1-D Array and Arthmetic Operations on the array
//make sure the file name is same as class name
//Coder : Phantom-fs

import java.util.*;

public class Array_1D
{
    public static void main (String[] args) throws Exception
    {
        String newline = System.lineSeparator();
        Scanner scanner = new Scanner(System.in);
        Array_1D defaultobj = new Array_1D();

        System.out.print(newline + "***************************************************************************" + newline);

        System.out.print(newline+"Enter the size of array : ");
        int size = scanner.nextInt();

        //array declaration of size N based on user input
        int arr[] = new int[size];

        System.out.print(newline);

        for(int i = 0; i < arr.length; i++)
        {
            System.out.print("Element "+(i+1)+" : ");
            arr[i] = scanner.nextInt();
        }

        defaultobj.line();

        //method to print all the elements of the array
        System.out.print(newline+"Elements of the array are : "+newline);
        defaultobj.printArray(arr);
        
        System.out.print(newline);
        defaultobj.line();

        //method to print odd elements of the array
        System.out.print(newline+"Odd elements of the array are : "+newline);
        defaultobj.printOdd(arr);

        System.out.print(newline);
        defaultobj.line();

        //method to print even elements of the array
        System.out.print(newline+"Even elements of the array are : "+newline);
        defaultobj.printEven(arr);

        System.out.print(newline);
        defaultobj.line();

        //method to print sum of all the elements of the array
        System.out.print(newline+"Sum of all the elements of the array : "+defaultobj.sum(arr)+newline);

        defaultobj.line();

        //method to print sum of odd elements of the array
        System.out.print(newline+"Sum of odd Index elements of the array : "+defaultobj.sumOddIndex(arr)+newline);

        defaultobj.line();

        //method to print sum of even elements of the array
        System.out.print(newline+"Sum of even Index elements of the array : "+defaultobj.sumEvenIndex(arr)+newline);

        defaultobj.line();

        //method to find and print the largest element of the array
        System.out.print(newline+"Largest element of the array : "+defaultobj.largest(arr)+newline);

        defaultobj.line();

        //method to find and print the second largest element of the array
        System.out.print(newline+"Second largest element of the array : "+defaultobj.secondLargest(arr)+newline);

        defaultobj.line();

        //method to find and print the third largest element of the array
        System.out.print(newline+"Third largest element of the array : "+defaultobj.thirdLargest(arr)+newline);

        defaultobj.line();

        System.out.print(newline+"How do you want to sort the array?"+newline);
        System.out.print("1. Ascending"+newline);
        System.out.print("2. Descending"+newline);

        System.out.print(newline+"Enter your choice : ");
        char choice = scanner.next().charAt(0);
        
        if(choice == '1')
        {
            //method to sort the array in ascending order
            defaultobj.sortAscending(arr);
        }

        else if(choice == '2')
        {
            //method to sort the array in descending order
            defaultobj.sortDescending(arr);
        }

        else
        {
            System.out.print(newline+"Invalid choice!"+newline);
        }

        System.out.print(newline);
        System.out.print(newline + "***************************************************************************" + newline);

        scanner.close();
    }  
    
    void printArray(int arr[])
    {
        String newline = System.lineSeparator();

        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(newline +"Element "+(i+1)+" : "+arr[i]);
        }
    }

    void printOdd(int arr[])
    {
        String newline = System.lineSeparator();

        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i]%2 != 0)
            {
                System.out.print(newline +"Element "+(i+1)+" : "+arr[i]);
            }
        }
    }

    void printEven(int arr[])
    {
        String newline = System.lineSeparator();

        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i]%2 == 0)
            {
                System.out.print(newline +"Element "+(i+1)+" : "+arr[i]);
            }
        }
    }

    int sum(int arr[])
    {
        int sum = 0;

        for(int i = 0; i < arr.length; i++)
        {
            sum += arr[i];
        }

        return sum;
    }

    int sumOddIndex(int arr[])
    {
        int sum = 0;

        for(int i = 0; i < arr.length; i++)
        {
            if(i%2 != 0)
            {
                sum += arr[i];
            }
        }

        return sum;
    }

    int sumEvenIndex(int arr[])
    {
        int sum = 0;

        for(int i = 0; i < arr.length; i++)
        {
            if(i%2 == 0)
            {
                sum += arr[i];
            }
        }

        return sum;
    }

    int largest(int arr[])
    {
        int largest = arr[0];

        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] > largest)
            {
                largest = arr[i];
            }
        }

        return largest;
    }

    int secondLargest (int arr[])
    {
        int largest = arr[0];
        int secondLargest = arr[0];

        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] > largest)
            {
                secondLargest = largest;
                largest = arr[i];
            }
            else if(arr[i] > secondLargest)
            {
                secondLargest = arr[i];
            }
        }

        return secondLargest;
    }

    int thirdLargest (int arr[])
    {
        int largest = arr[0];
        int secondLargest = arr[0];
        int thirdLargest = arr[0];

        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] > largest)
            {
                thirdLargest = secondLargest;
                secondLargest = largest;
                largest = arr[i];
            }
            else if(arr[i] > secondLargest)
            {
                thirdLargest = secondLargest;
                secondLargest = arr[i];
            }
            else if(arr[i] > thirdLargest)
            {
                thirdLargest = arr[i];
            }
        }

        return thirdLargest;
    }

    //array sorting from smallest to greatest
    void sortAscending(int arr[])
    {
        String newline = System.lineSeparator();
        int temp = 0;

        for(int i = 0; i < arr.length; i++)
        {
            for(int j = i+1; j < arr.length; j++)
            {
                if(arr[i] > arr[j])
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        line();

        System.out.print(newline+"Array after sorting in ascending order : "+newline);
        printArray(arr);
    }

    //array sorting from greatest to smallest
    void sortDescending(int arr[])
    {
        String newline = System.lineSeparator();
        int temp = 0;

        for(int i = 0; i < arr.length; i++)
        {
            for(int j = i+1; j < arr.length; j++)
            {
                if(arr[i] < arr[j])
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        line();

        System.out.print(newline+"Array after sorting in descending order : "+newline);
        printArray(arr);
    }

    void line ()
    {
        String newline = System.lineSeparator();

        System.out.print(newline + "***************************************************************************" + newline);
    }
}
