import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("How many subject do you have:");
        int totalSubject = sc.nextInt();

        System.out.println("Enter your marks of each subject:");
        
        int totalMarks=0;
        for(int i=0;i<totalSubject;i++){
            int subMarks = sc.nextInt();
            totalMarks+=subMarks;
        }

        System.out.println("Total marks obtained is:"+ totalMarks);

        float avgPercent = totalMarks/totalSubject;
        System.out.println("Average Percentage is: "+ avgPercent);

        float grade = (float) (avgPercent/9.5);
        System.out.println("Your grade is: "+ grade);

    }
}
