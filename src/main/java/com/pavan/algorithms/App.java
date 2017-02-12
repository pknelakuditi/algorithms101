package com.pavan.algorithms;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int[] unsortedArray = {1, 2, 2, 5, 4, 3, 1};
        int[] temp = Arrays.copyOf(unsortedArray, unsortedArray.length);
        Arrays.sort(temp);
        System.out.println(Arrays.toString(unsortedArray));
        System.out.println(Arrays.toString(temp));
    }
}
