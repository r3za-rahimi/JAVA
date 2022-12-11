import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("enter txt");
        String txt = scn.next();

        StringBuilder result =  new StringBuilder();

        for (int i = (txt.length()-1); i >= 0; i--){

           result = result.append(txt.charAt(i));

        }

        System.out.println(result);
        System.out.println("gitt change for three time ");
        System.out.println("master changes ");

    }

}
