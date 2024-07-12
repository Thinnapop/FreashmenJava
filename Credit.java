import java.util.Scanner;

public class Credit {
    public static void main(String[] args) {

        int A = 4;
        int B = 3;
        int C = 2;
        int D = 1;

        int mathCredit = 3;
        int englishCredit = 2;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your English grade:");
        int englishGrade = scanner.nextInt();

        System.out.println("Enter your Math grade:");
        int mathGrade = scanner.nextInt();

        int avgEnglish = englishGrade * englishCredit;
        int avgMath = mathGrade * mathCredit;

        double GPA = ((double) avgEnglish + avgMath) / (englishCredit + mathCredit);
        System.out.println("Your GPA is: " + GPA);
    } 
}
