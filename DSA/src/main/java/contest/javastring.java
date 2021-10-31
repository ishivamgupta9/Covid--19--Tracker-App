package contest;

import java.util.Locale;

public class javastring {


public static void main(String []args){

    String A="pehkinkjllo";
    String B="java";


     System.out.println(A.toUpperCase(Locale.ROOT));


  String c=A.substring(0,1);
String d=  c.toUpperCase();


  StringBuilder stringBuilder=new StringBuilder();
  stringBuilder.append(d);
  stringBuilder.append(A.substring(1));
  stringBuilder.append(" ");
  stringBuilder.append(B.substring(0,1).toUpperCase(Locale.ROOT));
  stringBuilder.append(B.substring(1));

  System.out.println(stringBuilder);



    System.out.println(A.length()+B.length());

    if(A.compareTo(B)>1){
        System.out.println("yes");


    }else
        System.out.println("No");


    }






}
