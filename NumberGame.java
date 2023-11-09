import java.util.Random;
import java.util.Scanner;

class NumberGame{
    public static void main(String[] args) {
        
        System.out.println("Lets start the Game");
        System.out.println("Choose num between 0 to 99");
        
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int attempts = 10;
        
        while(true){
            int comNum = rd.nextInt(100);
            int i=0;
            
            while (i<attempts) {

                System.out.println("Enter your guess number: ");
                int userI = sc.nextInt();
                if(userI==comNum) {
                    System.out.println("Your guess is correct");
                    break;
                }
                else if(userI<comNum) System.out.println("Your guess num is too low");
                else  System.out.println("Your guess num is too high");
                i++;
            }
            if(i==attempts) System.out.println("Sorry, You are out of attempts!");

            System.out.println("Do you want to play game again(yes/no): ");
            String s = sc.next().toLowerCase();
            if(!s.equals("yes")) break;
        }
    }
}