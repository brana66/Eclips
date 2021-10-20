import java.util.Scanner;
import java.util.Random;

public class Game {
    public static void main(String[]args){
    
    	System.out.println("Let's play rock, paper, scissor....");
      
    	System.out.println("Enter 0 : rock | 1 : paper | 2 : scissor" +"\n" + "enter your choice : ");
        Scanner sc = new Scanner(System.in);
        int ui = sc.nextInt();

        Random rd = new Random();
        int ci = rd.nextInt(3);

        System.out.println("ci choice: " + ci);

        if(ui==ci){
            System.out.println("Draw"); }
        else if ( ui==0 && ci==1 || ui==1 && ci==2 || ui==2 && ci==0){
            System.out.println("ci wins");}
        else
            System.out.println("ui wins");
        
        
        System.out.println("Thanks for playing Mate!");
    }
}
