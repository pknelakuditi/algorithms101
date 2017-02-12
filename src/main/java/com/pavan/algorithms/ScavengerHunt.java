
package com.pavan.algorithms;

import java.util.HashSet;
import java.util.Scanner;

/**
 * ScavengerHunt
 * // spoj.com/problems/SCAVHUNT/
 *
 */
public class ScavengerHunt {

    public static void main (final String[] args){

        final Scanner sc;
        try {
           // File file = new File("/home/pkn/algorithm101/src/test/resources/ScavengerHunt.input");
            sc = new Scanner(System.in);
            final int noOfScenarios = sc.nextInt();
            for (int currentScenario = 0; currentScenario < noOfScenarios; currentScenario++) {
                int steps = sc.nextInt();
                final String[][] allPairs = new String[steps-1][2];
                final String[] sortedList = new String[steps];
                final HashSet<String> left = new HashSet<String>();
                final HashSet<String> right = new HashSet<String>();
                for (int i = 0; i < steps-1; i++) {
                    final String[] pair = new String[2];
                    pair[0] = sc.next();
                    pair[1] = sc.next();
                    allPairs[i] = pair;
                    left.add(pair[0]);
                    right.add(pair[1]);
                }
                for (int i = 0; i < steps-1; i++) {
                    if(!left.contains(allPairs[i][1])){
                        sortedList[steps-1] = allPairs[i][1];
                    }
                    if(!right.contains(allPairs[i][0])){
                        sortedList[0] = allPairs[i][0];
                    }
                }

                for (int i = 0; i < steps; i++) {
                    if(i ==  0)
                        continue;
                    else if (i == steps-1)
                        continue;
                    else{
                        sortedList[i] = getNextStep(allPairs, sortedList[i-1]);
                    }
                }
                System.out.println("Scenario #"+(currentScenario+1));
                for (int i = 0; i < sortedList.length; i++) {
                    System.out.println(sortedList[i]);
                }
                System.out.println();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private static String getNextStep(final String[][] allPairs, final String previousStepName) {
        for (String[] pair : allPairs){
            if(pair[0].equals(previousStepName)){
                return pair[1];
            }
        }
        return null;
    }

}
