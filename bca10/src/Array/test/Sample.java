package Array.test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Sample
{
    public static void main(String[]args){

        Scanner s=new Scanner(System.in);
        String a[]=new String[5];
        System.out.println("Enter the elements:");
        for(int i=0;i<a.length;i++)
        {
            a[i]=s.next();

        }
        System.out.println("Array elements are:");
        System.out.println(Arrays.toString(a));
    }
}
