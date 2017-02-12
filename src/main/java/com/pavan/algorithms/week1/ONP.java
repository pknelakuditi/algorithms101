
package com.pavan.algorithms.week1;

import java.io.File;
import java.util.Scanner;

/**
 * ONP spoj.com/problems/ONP
 Input:
 3
 (a+(b*c))
 ((a+b)*(z+x))
 ((a+t)*((b+(a+c))^(c+d)))

 Output:
 abc*+
 ab+zx+*
 at+bac++cd+^*
 */
public class ONP {
    public static void main(String[] args){
        final Scanner sc;
        try {
            final File file = new File("src/test/resources/ONP.input");
            sc = new Scanner(System.in);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
