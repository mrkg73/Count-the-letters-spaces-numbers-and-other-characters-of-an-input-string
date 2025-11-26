import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter your text");
        String nam= sc.nextLine();
        int size=nam.length();

        int [] count= new int[4];

        for (int i=0; i<size; i++)
        {
            char chk= nam.charAt(i);

              if(Character.isLetter(chk)) count [0]++;
              else if(Character.isWhitespace(chk)) count [1]++;
              else if(Character.isDigit(chk)) count [2]++;
              else count[3]++;
        }
        System.out.println("The String has: " + count[0] +" Letters");
        System.out.println("The String has: " + count[1] +" spaces");
        System.out.println("The String has: " + count[2] +" numbers");
        System.out.println("The String has: " + count[3] +" others characters");

    }
}
