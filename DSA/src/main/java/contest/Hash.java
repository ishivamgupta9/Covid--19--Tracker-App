package contest;

import java.util.HashMap;
import java.util.Scanner;

public class Hash {

    public static void main (String []args){

        Scanner sc=new Scanner(System.in);
int i,t;
String s;
       System.out.println("eNTER N");
        int n=sc.nextInt();
        sc.nextLine();
        HashMap<String,Integer> h=new HashMap<>();

        for ( i=0;i<n;i++){
             s=sc.nextLine();
            t=sc.nextInt();

            h.put(s,t);
            sc.nextLine();

        }
        while(sc.hasNext()) {
            String s1 = sc.nextLine();
            if (h.containsKey(s1)) {
                System.out.println(s1 + "=" + h.get(s1));
            } else {
                System.out.println("Error");
            }


        }}}


