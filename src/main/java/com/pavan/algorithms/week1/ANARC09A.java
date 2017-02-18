
package com.pavan.algorithms.week1;

import java.io.File;
import java.util.*;


/**
 * ANARC09A  spoj.com/problems/ANARC09A
 Input:
 }{
 {}{}{}
 {{{}
 ---

 Output:
 1. 2
 2. 0
 3. 1
 */
public class ANARC09A {
    public static void main(String[] args){
        final Scanner sc;
        try {
            final File file = new File("src/test/resources/ANARC09A.input");
            sc = new Scanner(file);
            // code here
            List<String> list= new ArrayList<String>();

            char[] ch=new char[10];
            Set<Character> stuff=new HashSet<Character>();
            ch[0]=' ';
            while(ch[0] != '-')
            {
                list.add(sc.nextLine());
                String line1=list.get(list.size() - 1);
                ch=line1.toCharArray();

            }
            int j=1;
            Iterator itr=list.iterator();
            for(String st1:list){

                char[] st=st1.toCharArray();
                int i=0,x=0;
                while(i<st.length){
                    if((st[i]=='{')&& i<st.length-1 && (st[i+1]=='}')){
                        i=i+1;
                    }
                    else if(st[i]=='{' || st[i]=='}'){
                        stuff.add(st[i]);

                    }
                    i=i+1;
                }
                System.out.println("\n"+j+". "+stuff.size());
                stuff.clear();
                j=j+1;
                if(j>=list.size())
                {
                    break;
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
