//Welcome to Rock Paper Scissors!
//Choose either R,P, or S to see if you Win.





import java.util.Scanner;
import java.util.Random;

public class rpc {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Random rand = new Random();
        int num;
        // score variable
        int wins = 0;
        int losses = 0;


        //loop
        while (true){String userChoice = "";
            String computerChoice = "";





            System.out.println("Welcome to Rock, Paper, Scissors!");
            System.out.println("Choose R)ock, P) aper, or S) cissors.");
            System.out.println("Type quit to leave");



            userChoice = sc.nextLine();
            if (userChoice.equals("quit")){
                break;
            }

            //computer choice
            num =rand.nextInt(3);
            if ((num == 0))
            {
                computerChoice = "R";
            }
            if ((num == 1))
            {
                computerChoice = "S";
            }
            if ((num == 2))
            {
                computerChoice = "P";
            }
            if (userChoice.equals("quit")){
                break;
            }



            //Print computer choice
            if (computerChoice.equals("S"))
            {
                System.out.println("Computer chose scissors");

            }
            if(computerChoice.equals("R"))
            {
                System.out.println("Computer chose Rock");
            }
            if (computerChoice.equals("P"))
            {
                System.out.println("Computer chose Paper");
            }

            //Determine Winner
            if (userChoice.equals("R") && computerChoice.equals("S"))
            {
                System.out.println("U win!");
                wins++;
            }
            if (userChoice.equals("R") && computerChoice.equals("P"))
            {
                System.out.println("U lose!");
                losses++;
            }
            if (userChoice.equals("R") && computerChoice.equals("R"))
            {
                System.out.println("Tie!");
            }
            if (userChoice.equals("P") && computerChoice.equals("S"))
            {
                System.out.println("U lose!");
                losses++;
            }
            if (userChoice.equals("P") && computerChoice.equals("R"))
            {
                System.out.println("U win!");
                wins++;
            }
            if (userChoice.equals("P") && computerChoice.equals("P"))
            {
                System.out.println("Tie!");
            }
            if (userChoice.equals("S") && computerChoice.equals("S"))
            {
                System.out.println("Tie!");
            }
            if (userChoice.equals("S") && computerChoice.equals("P"))
            {
                System.out.println("U win!");
                wins++;
            }
            if (userChoice.equals("S") && computerChoice.equals("R"))
            {
                System.out.println("U lose!");
                losses++;
            }
            //print wins and losses
            System.out.println("Games won " + wins );
            System.out.println("Games lost " + losses );
            System.out.println('\t');

       }
        }}










