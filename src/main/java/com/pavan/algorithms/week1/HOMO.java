
package com.pavan.algorithms.week1;

import java.io.File;
import java.util.Scanner;

/**
 * HOMO spoj.com/problems/HOMO
 Input:
 11
 insert 1
 insert 2
 insert 1
 insert 4
 delete 1
 delete 3
 delete 2
 delete 1
 insert 4
 delete 4
 delete 4

 Output:
 neither
 hetero
 both
 both
 hetero
 hetero
 hetero
 neither
 homo
 neither
 neither
 Submit solution!

 */
public class HOMO {
    public static void main(String[] args){
        final Scanner sc;
        try {
            final File file = new File("src/test/resources/HOMO.input");
            sc = new Scanner(System.in);
            // code here

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
