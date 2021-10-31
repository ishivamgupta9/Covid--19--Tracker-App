package contest;

import java.util.Scanner;
import java.util.Stack;

public class stack_problem_bracket {
    public static boolean matching(char a,char b){
        return (( a=='(' && b==')' )||( a=='[' && b==']' )||( a=='{' && b=='}' ));
    }

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String input = sc.next();
            //Complete the code
            Stack <Character> s =new Stack<>();
            for(int i=0;i<input.length();i++)

            {
                if(input.charAt(i)== '(' || input.charAt(i) == '[' || input.charAt(i)=='{'){
                    s.push(input.charAt(i));
                }
                else {
                    if (s.isEmpty()==true)
                        System.out.println("false");
                    else if (matching(s.peek(), input.charAt(i)) == true)
                        s.pop();
                    else
                        System.out.println("false");

                }
            }
            System.out.println(s.isEmpty());



        }


    }
}