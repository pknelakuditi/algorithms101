
package com.pavan.algorithms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

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

                final Set<String> right = new HashSet<String>();
                final Map<String,String[]> map = new HashMap<String,String[]>();
                final List<String[]> linked= new ArrayList<String[]>();


                for (int i = 0; i < steps-1; i++) {
                    final String[] pair = new String[2];
                    pair[0] = sc.next();
                    pair[1] = sc.next();
                    map.put(pair[0],pair);
                    right.add(pair[1]);
                }
                String firstStep = null;
                for (final Map.Entry<String,String[]> entrySet : map.entrySet()) {
                    if(!right.contains(entrySet.getKey())){
                        firstStep = entrySet.getValue()[0];
                    }
                }

                String currentLeftElement = firstStep;
                while(map.containsKey(currentLeftElement)){
                    final String[] currentPair = map.get(currentLeftElement);
                    linked.add(currentPair);
                    currentLeftElement = currentPair[1];
                }



                System.out.println("Scenario #"+(currentScenario+1));
                for (int i = 0; i < linked.size(); i++) {
                    System.out.println(linked.get(i)[0]);
                }
                System.out.println(currentLeftElement);
                System.out.println();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
