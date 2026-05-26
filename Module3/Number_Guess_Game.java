import java.util.*;

public class Number_Guess_Game {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while(true){
            int score=0;
            System.out.println("Are you want to play Multiple rounds or Until you win ( M or U ):");
            char ch=in.next().trim().charAt(0);
            switch(ch){
                case 'M':
                    System.out.println("How many rounds you want:");
                    int rounds=in.nextInt();
                    int point=MultipleRound(rounds,score);
                    System.out.println("You scored "+point);
                    break;
                case 'm':
                    System.out.println("How many rounds you want:");
                    int rouds=in.nextInt();
                    int pont=MultipleRound(rouds,score);
                    System.out.println("You scored "+pont);
                    break;
                case 'U':
                    System.out.println("The game is to begin");
                    int points=UntilWin(score);
                    System.out.println("You scored "+points);
                    break;
                case 'u':
                    System.out.println("The game is to begin");
                    int pints=UntilWin(score);
                    System.out.println("You scored "+pints);
                    break;
                default:
                    System.out.println("Enter Invalid character");
                    break;
            }
        }
    }
    static int UntilWin(int points){
        Random ran=new Random();
        Scanner in=new Scanner(System.in);
        int random_number=ran.nextInt(100)+1;
        System.out.println("**NOTE:If you want to exit the game just choose '0'**");
        while(true){
            System.out.println("* Guess the number *");
            int guess=in.nextInt();
            if(guess==0){
                return points;
            }
            else {
                if (guess > random_number) {
                    System.out.println("Your guess far more away!!");
                    points += 10;
                } else if (guess < random_number) {
                    System.out.println("So close!!");
                    points += 20;
                } else {
                    System.out.println("Your guess is Correct!!");
                    System.out.println("* You Won! *");
                    points += 50;
                    return points;
                }
            }
        }
    }
    static int MultipleRound(int rounds,int points){
        Random ran=new Random();
        Scanner in=new Scanner(System.in);
        int random_number=ran.nextInt(100)+1;
        while(rounds>0) {
            System.out.println("* Guess the number *");
            int guess = in.nextInt();
            if (guess > random_number) {
                System.out.println("Your guess far more away!!");
                points += 10;
            } else if (guess < random_number) {
                System.out.println("So close!!");
                points += 20;
            } else {
                System.out.println("Your guess is Correct!!");
                System.out.println("* You Won! *");
                points += 50;
                return points;
            }
            rounds--;
        }
        System.out.println("The random number is "+random_number);
        return points;
    }
}