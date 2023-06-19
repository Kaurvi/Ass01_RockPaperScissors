import java.util.Scanner;

public class rockpaperscissor {
    public static void main(String[] args) {
        Scanner in = new Scanner ( System.in );
        String playA = "";
        String playB = "";
        String playAgain = "Y";
        String moves = "";
        String moveTrash = "";
        boolean done = false;

        do {
            System.out.println("playA : CHOOSE YOUR MOVE [R,S,P]");
            playA = in.nextLine();
            System.out.println("playB : CHOOSE YOUR MOVE [R,S,P]");
            playB = in.nextLine();

            if(playA.equalsIgnoreCase("R"))
            {
                if(playB.equalsIgnoreCase("R"))
                {
                    System.out.println ( "Its a tie R X R" );
                }
                else if(playB.equalsIgnoreCase("P"))
                {
                    System.out.println("Paper covers Rock Player B wins");
                }
                else if (playB.equalsIgnoreCase("S"))
                {
                    System.out.println("Rock breaks Scissors Player A wins");
                }
            }
            else if(playA.equalsIgnoreCase("P"))
            {
                if(playB.equalsIgnoreCase("R"))
                {
                    System.out.println("Paper covers Rock Player A wins");
                }
                else if(playB.equalsIgnoreCase("P"))
                {
                    System.out.println("Its a tie P X P");
                }
                else if (playB.equalsIgnoreCase("S"))
                {
                    System.out.println ( "Scissor cut Paper Player B wins" );
                }
            }
            else if (playA.equalsIgnoreCase ( "S" ))
            {
                if(playB.equalsIgnoreCase("R"))
                {
                    System.out.println(" Rock breaks Scissor Player B wins");
                }
                else if(playB.equalsIgnoreCase("P"))
                {
                    System.out.println("Scissor cut Paper Player A wins");}
                else if (playB.equalsIgnoreCase("S"))
                {
                    System.out.println ( "Its a tie S X S" );
                }
            }
            else {
                System.out.println ( "Please enter a valid move [R,S,P}");
            }
            System.out.println ("Do you want to play again (Y/N): ");
            playAgain = in.nextLine ();
            if(playAgain.equalsIgnoreCase ( "N" )) {
                done = true;
            } else if(playAgain.equalsIgnoreCase ( "Y" )) {
                done = false;
            }
        } while(!done);

    }
}