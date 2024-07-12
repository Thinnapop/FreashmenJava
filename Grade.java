import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        System.out.println("Enter your score:");
        int score = scanner.nextInt(); 

        if (score >= 80) {
            System.out.println("Congrats you got A!!");
        }
        else if (score >= 70){
            System.out.println("You got B");
        }
        else if (score >= 60){
            System.out.println("You got C my lil bro");
        }
        else {
            System.out.println("You're trash");
        }

    }
}
