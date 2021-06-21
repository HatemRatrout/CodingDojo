import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Arrays;

public class PuzzleJava {
    public static ArrayList FirstTask() {
        int sum = 0;
        int[] arr = { 3, 5, 1, 2, 7, 9, 8, 13, 25, 32 };
        ArrayList<Integer> newArr = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 10)
                newArr.add(arr[i]);
            sum += arr[i];
        }
        System.out.println(sum);
        return newArr;
    }

    public static void shuffeArray(Object[] arr) {
        Random r = new Random();
        for (int i = 0; i < arr.length / 2; i++) {
            Object temp = arr[i];
            int randomIdx = r.nextInt(arr.length - i) + i;
            arr[i] = arr[randomIdx];
            arr[randomIdx] = temp;
        }
    }

    public static ArrayList SecondTask() {
        String[] arr = { "Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa" };
        ArrayList<String> newArr = new ArrayList<String>();
        shuffeArray(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() > 5)
                newArr.add(arr[i]);
            System.out.println(arr[i]);
        }
        return newArr;
    }

    public static void ThirdTask() {
        Character[] alphabet = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q',
                'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
        shuffeArray(alphabet);
        System.out.println("Last alphabet in the array is : " + alphabet[25]);
        if (alphabet[0] == 'a' || alphabet[0] == 'e' || alphabet[0] == 'o' || alphabet[0] == 'u' || alphabet[0] == 'i')
            System.out.println("First alphabet in the array is : " + alphabet[0] + " and it's a vowel letter.");
        else
            System.out.println("First alphabet in the array is : " + alphabet[0]);
    }

    public static int[] FourthTask() {
        int[] arr = new int[10];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100 - 55) + 55;
        }
        return arr;
    }

    public static void FifthTask() {
        int[] arr = new int[10];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100 - 55) + 55;
        }
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public static String SixthTask() {
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        StringBuilder sb = new StringBuilder(5);
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            char c = alphabet[random.nextInt(alphabet.length)];
            sb.append(c);
        }
        String newStr = sb.toString();
        System.out.println(newStr);
        return newStr;
    }
    public static void SeventhTask ()
    {
        for (int i=0; i<10; i++)
        {
            SixthTask();
        }
    }
    public static void main(String[] args) {
        SeventhTask ();
    }
}