package contest;

public class palindromestrig {


    public static void main (String []args){

        String A="GEdEG";
        StringBuilder s =new StringBuilder();
        s.append(A);
        s.reverse();

            System.out.println(s);
        System.out.println(A);
        System.out.println(A.equals(s.toString()));



    }



}
