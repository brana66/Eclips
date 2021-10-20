import java.util.Scanner;

public class Age {
    public static void main(String[] args){
       System.out.println("Enter the age: ");
       Scanner sc = new Scanner(System.in);
       String a = "kti";

        switch (a) {
            case "kti" -> System.out.println("child");
            case "Bhakti" -> System.out.println("Adult");
            case "avi" -> System.out.println("Middle Aged");
            default -> System.out.println("enter valid age");


            //System.out.println(a);
        }
    }
}