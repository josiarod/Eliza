import java.util.Arrays;
import java.util.Scanner;

public class Eliza {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;

        Boolean again = false;
        while(!again) {
            System.out.print("Good day. What is your problem? Enter your response here or Q to quit: ");
            input = sc.nextLine();


            String[] inputArray = input.split(" ");

            for(int i = 0; i < inputArray.length; i++){
                if(inputArray[i].equalsIgnoreCase("i") || inputArray[i].equalsIgnoreCase("me")){
                    inputArray[i] = "you";
                } else if (inputArray[i].equalsIgnoreCase("my")){
                    inputArray[i] = "your";
                }else if(inputArray[i].equalsIgnoreCase("am")){
                    inputArray[i] = "are";
                }

            }
            if(input.equalsIgnoreCase("q") || input.equalsIgnoreCase("I am feeling great" )){
                System.out.println(">>> END");
                break;
            }

            System.out.println("Why do you say that " + String.join("  ", inputArray) + "?");


        }
    }
}
