import java.util.Scanner;

public class Eliza {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;

        Boolean again = false;
        while(!again) {
            System.out.print("Good day. What is your problem? Enter your response here or Q to quit: ");
            input = sc.nextLine();
            System.out.println(input);

            if(input.equalsIgnoreCase("q") || input.equalsIgnoreCase("I am feeling great" )){
                System.out.println(">>> END");
                break;
            }
        }
    }
}
