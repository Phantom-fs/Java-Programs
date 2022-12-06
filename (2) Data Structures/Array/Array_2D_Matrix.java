//Program on 2-D Array (Matrix) and Arthmetic Operations on the 2-D array
//make sure the file name is same as class name
//Coder : Phantom-fs

import java.util.*;

public class Array_2D_Matrix 
{
    int arr[][] = new int[3][3];
    int arr2[][] = new int[3][3];

    public static void main (String[] args)
    {
        String newline = System.lineSeparator();
        Scanner scanner = new Scanner(System.in);

        System.out.print(newline+"***************************************************************************"+newline);

        Array_2D_Matrix obj = new Array_2D_Matrix();

        System.out.print(newline+"Enter the elements of the array: "+newline+newline);
        for (int i = 0; i<3; i++)
        {
            for (int j = 0; j<3; j++)
            {
                System.out.print("Element ["+i+"]["+j+"] : ");
                obj.arr[i][j] = scanner.nextInt();
            }
            System.out.print(newline);
        }

        obj.line();

        System.out.print(newline+"The elements of the array are: "+newline+newline);
        obj.print2DArray(obj.arr);

        obj.line();

        System.out.print(newline+"The rows of the array are: "+newline);
        obj.print2DArrayRows(obj.arr);

        obj.line();

        System.out.print(newline+"The columns of the array are: "+newline);
        obj.print2DArrayColumns(obj.arr);

        obj.line();

        obj.print2DArrayDiagonal(obj.arr);

        obj.line();

        obj.print2DArraySum(obj.arr);

        obj.line();

        obj.print2DArrayRowSum(obj.arr);
        System.out.print(newline);

        obj.line();

        obj.print2DArrayColumnSum(obj.arr);
        System.out.print(newline);

        obj.line();

        System.out.print(newline+"Enter the elements of the second array: "+newline+newline);
        for (int i = 0; i<3; i++)
        {
            for (int j = 0; j<3; j++)
            {
                System.out.print("Element ["+i+"]["+j+"] : ");
                obj.arr2[i][j] = scanner.nextInt();
            }
            System.out.print(newline);
        }

        obj.line();

        obj.add2DArrays(obj.arr, obj.arr2);

        obj.line();

        obj.subtract2DArrays(obj.arr, obj.arr2);

        obj.line();

        obj.multiply2DArrays(obj.arr, obj.arr2);

        System.out.print(newline+"***************************************************************************"+newline);

        scanner.close();
    }    

    void print2DArray (int arr[][])
    {
        String newline = System.lineSeparator();

        for (int i=0; i<arr.length; i++)
        {
            for (int j=0; j<arr[i].length; j++)
            {
                System.out.print("Element ["+i+"]["+j+"] : "+arr[i][j]+'\t');
            }
            System.out.print(newline);
        }
        System.out.print(newline);
    }

    //display all the rows of the 2D array
    void print2DArrayRows (int arr[][])
    {
        String newline = System.lineSeparator();

        for (int i=0; i<arr.length; i++)
        {
            System.out.print(newline+"Row "+(i+1)+" : ");

            for (int j=0; j<arr[i].length; j++)
            {
                System.out.print(arr[i][j]+" ");
            }
        }
        System.out.print(newline);
    }

    //display all the columns of the 2D array
    void print2DArrayColumns (int arr[][])
    {
        String newline = System.lineSeparator();

        for (int i=0; i<arr[0].length; i++)
        {
            System.out.print(newline+"Column "+(i+1)+" : ");

            for (int j=0; j<arr.length; j++)
            {
                System.out.print(arr[j][i]+" ");
            }
        }
        System.out.print(newline);
    }

    //display diagonal elements of the 2D array
    void print2DArrayDiagonal (int arr[][])
    {
        String newline = System.lineSeparator();

        System.out.print(newline+"Diagonal Elements : ");

        for (int i=0; i<arr.length; i++)
        {
            for (int j=0; j<arr[i].length; j++)
            {
                if (i==j)
                {
                    System.out.print(arr[i][j]+"  ");
                }
            }
        }
        System.out.print(newline);
    }

    //display the each row's sum
    void print2DArrayRowSum (int arr[][])
    {
        String newline = System.lineSeparator();

        for (int i=0; i<arr.length; i++)
        {
            int sum = 0;

            for (int j=0; j<arr[i].length; j++)
            {
                sum += arr[i][j];
            }

            System.out.print(newline+"Sum of Row "+(i+1)+" : "+sum);
        }
    }

    //display the each column's sum
    void print2DArrayColumnSum (int arr[][])
    {
        String newline = System.lineSeparator();

        for (int i=0; i<arr[0].length; i++)
        {
            int sum = 0;

            for (int j=0; j<arr.length; j++)
            {
                sum += arr[j][i];
            }

            System.out.print(newline+"Sum of Column "+(i+1)+" : "+sum);
        }
    }

    //display the sum of all the elements of the 2D array
    void print2DArraySum (int arr[][])
    {
        String newline = System.lineSeparator();
        int sum = 0;

        for (int i=0; i<arr.length; i++)
        {
            for (int j=0; j<arr[i].length; j++)
            {
                sum += arr[i][j];
            }
        }

        System.out.print(newline+"Sum of all the elements of the 2D array : "+sum+newline);
    }

    //addition of two 2D arrays
    void add2DArrays (int arr1[][], int arr2[][])
    {
        String newline = System.lineSeparator();

        if (arr1.length == arr2.length && arr1[0].length == arr2[0].length)
        {
            //arr1.length provides us with the length of the rows
            //arr1[0].length provides us with the length of the columns
            int arr3[][] = new int[arr1.length][arr1[0].length];

            for (int i=0; i<arr1.length; i++)
            {
                for (int j=0; j<arr1[i].length; j++)
                {
                    arr3[i][j] = arr1[i][j] + arr2[i][j];
                }
            }

            System.out.print(newline+"Addition of two 2D arrays : "+newline+newline);
            print2DArray(arr3);
        }
        else
        {
            System.out.print(newline+"Addition of two 2D arrays is not possible, as size is different!"+newline);
        }
    }

    //subtraction of two 2D arrays
    void subtract2DArrays (int arr1[][], int arr2[][])
    {
        String newline = System.lineSeparator();

        if (arr1.length == arr2.length && arr1[0].length == arr2[0].length)
        {
            int arr3[][] = new int[arr1.length][arr1[0].length];

            for (int i=0; i<arr1.length; i++)
            {
                for (int j=0; j<arr1[i].length; j++)
                {
                    arr3[i][j] = arr1[i][j] - arr2[i][j];
                }
            }

            System.out.print(newline+"Subtraction of two 2D arrays : "+newline+newline);
            print2DArray(arr3);
        }
        else
        {
            System.out.print(newline+"Subtraction of two 2D arrays is not possible, as size is different!"+newline);
        }
    }

    //multiplication of two 2D arrays
    void multiply2DArrays (int arr1[][], int arr2[][])
    {
        String newline = System.lineSeparator();

        if (arr1[0].length == arr2.length)
        {
            int arr3[][] = new int[arr1.length][arr2[0].length];

            for (int i=0; i<arr1.length; i++)
            {
                for (int j=0; j<arr2[0].length; j++)
                {
                    for (int k=0; k<arr1[0].length; k++)
                    {
                        arr3[i][j] += arr1[i][k] * arr2[k][j];
                    }
                }
            }

            System.out.print(newline+"Multiplication of two 2D arrays : "+newline+newline);
            print2DArray(arr3);
        }
        else
        {
            System.out.print(newline+"Multiplication of two 2D arrays is not possible, as size is different!"+newline);
        }
    }

    void line ()
    {
        String newline = System.lineSeparator();

        System.out.print(newline + "***************************************************************************" + newline);
    }
}
