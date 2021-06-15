import java.util.ArrayList;

public class Basics 
{
    public static void OneTo255()
    {
        for(int i=1; i<=255;i++)
        System.out.println(i);
    }
    public static void PrintOdds()
    {
        for (int i=1; i<=255; i+=2)
        System.out.println(i);
    }
    public static void PrintSum()
    {
        int sum = 0;
        for(int i=0; i<=255; i++)
        {
            sum+=i;
            System.out.println("New number: " + i + " Sum: " + sum);
        }
    }
    public static void PrintArray(int [] arr)
    {
        for (int i=0; i<arr.length; i++)
        {
            System.out.println(arr[i]);
        }
    }
    public static int FindMax(int [] arr)
    {
        int max = arr[0];
        for (int i=1; i<arr.length; i++)
        {
            if (arr[i]>max)
            max = arr[i];
        }
        return max;
    }
    public static int Average(int [] arr)
    {
        int sum=0;
        for (int i=0; i<arr.length; i++)
        {
            sum+=arr[i];
        }
        int avg = sum/arr.length;
        return avg;
    }
    public static ArrayList OddArray()
    {
        ArrayList<Integer> myArray = new ArrayList<Integer>();
        for (int i=1; i<=255; i+=2)
        {
            myArray.add(i);
        }
        return myArray;
    }
    public static int GreaterThanY(int [] arr, int Y)
    {
        int counter = 0;
        for (int i=0; i<arr.length; i++)
        {
            if(arr[i]>Y)
            counter++;
        }
        return counter;
    }
    public static int [] Square(int [] arr)
    {
        for (int i=0; i<arr.length; i++)
        {
            arr[i] = arr[i] * arr[i];
        }
        return arr;
    }
    public static int [] EliminateNegative(int [] arr)
    {
        for (int i=0; i<arr.length; i++)
        {
            if (arr[i]<0)
            arr[i]=0;
        }
        return arr;
    }
    public static int [] MinMaxAvg (int [] arr)
    {    
        int max = FindMax(arr);
        int min = arr[0];
        for (int i=1; i<arr.length; i++)
        {
            if(arr[i]<min)
            min = arr[i];
        }
        int avg = Average(arr);
        int [] newArr= {max, min, avg};
        return newArr;
    }
    public static int [] Shift(int [] arr)
    {
        for (int i=0; i < arr.length-1;i++)
        {
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]= 0;
        return arr;
    }
    public static void main(String[] args) {
        int [] X = {-2,10,-4,9,2};
    }
}