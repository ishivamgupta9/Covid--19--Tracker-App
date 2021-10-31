package string2;

import java.util.HashMap;

public class Removecommoncharactersandconcatenate {


    public static void main (String []args){

        String s1="ABCD";
        String s2="ABEF";

        String s3="";



        int j=0;
        HashMap<Character, Character> h=new HashMap<>();
        for (int i=0 ;i<s1.length() && j<s2.length() ;i++){

            if(s1.charAt(i)!=s2.charAt(j))
                h.put(s1.charAt(i),s2.charAt(j));

                j++;

        }


        StringBuilder mapAsString = new StringBuilder();
        for (Character key : h.keySet()) {
            mapAsString.append(key);

        }

        StringBuilder mapAsString1 = new StringBuilder();
        for (Character key1 : h.keySet()) {
            mapAsString1.append(h.get(key1));

        }


        System.out.println(mapAsString+""+mapAsString1);


    }

}
