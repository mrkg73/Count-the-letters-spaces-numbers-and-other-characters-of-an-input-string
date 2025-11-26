import java.util.Scanner;
import java.util.function.Consumer;


public class Main
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter your text");



        int [] count= new int[4];

       Consumer<String> run= ch-> {  ch.chars().forEach(s->
            {
          if(Character.isLetter(s)) count [0]++;
            else if(Character.isWhitespace(s)) count [1]++;
            else if(Character.isDigit(s)) count [2]++;
            else count[3]++;

            });};

            run.accept(sc.nextLine());

        System.out.println("The String has: " + count[0] +" Letters");
        System.out.println("The String has: " + count[1] +" spaces");
        System.out.println("The String has: " + count[2] +" numbers");
        System.out.println("The String has: " + count[3] +" others characters");

    }
}
