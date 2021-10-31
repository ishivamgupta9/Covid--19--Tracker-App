package contest;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Anagram {



    public static void main(String[]args){

    String a ="Geeks";
    String b="jsjshsj";

        if(a.length()!=b.length());
        System.out.println("No");

        char [] c=a.toCharArray();
      Arrays.sort(c);
        a=new String(c).toUpperCase();

        char [] d=b.toCharArray();
        Arrays.sort(d);
        b=new String(d);

       if( a.equals(b))
           System.out.println("yes");




    }


}
