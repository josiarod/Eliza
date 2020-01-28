import java.util.Random;
import java.util.Scanner;

public class Eliza {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;
        String[] hedges = {"Please tell me more ","Many of my patients tell me the same thing ","It is getting late, maybe we had better quit "};
        String[] qualifiers = {"Why do you say that ","So, you are concerned that "};
        Random r = new Random();
        Boolean again = false;
        System.out.print("Good day. What is your problem? Enter your response here or Q to quit: ");
        while(!again) {
            int x = r.nextInt(3);
            int y = r.nextInt(2);
            String randomHedge = hedges[x];
            String randomQualifiers = qualifiers[y];
            input = sc.nextLine();





            if(input.equalsIgnoreCase("q") || input.equalsIgnoreCase("I am feeling great" )){
                System.out.println(">>> END");
                break;
            }

            if(input.equalsIgnoreCase("pig")){
                String[] inputArray = input.split(" ");
                for(int i = 0; i < inputArray.length; i++){
                   solve(inputArray[i]);
                }
                System.out.println();
            }


            System.out.println(randomQualifiers + String.join("  ", question(input)) + "?");
            System.out.println(randomHedge);
            System.out.print("Enter your response here or Q to quit: ");


        }
    }

    public static String[] question(String input){

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

               return inputArray;
    }




    public static String solve (String word) {
        String temp = word.toLowerCase();
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        char first = temp.charAt(0);


        for (int i = 0; i < vowels.length; i++) {
            if (first == vowels[i]) {
                return word + "way";
            }
        }

        word = word.substring(1);
        word += first + "ay";


        return word;
    }




    }



