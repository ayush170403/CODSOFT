
import java.util.Scanner;

public class TASK2 {
    public static void main(String args[]) {
        int sum = 0, avg;
        Scanner sc = new Scanner(System.in);
        System.out.println("STUDENT GRADE CALCULATOR");
        System.out.println("Enter the total number of subjects");
        int p = sc.nextInt();
        for (int i = 1; i <= p; i++) {
            System.out.println("Enter marks for " + i + "st subject");
            int q = sc.nextInt();
            sum = sum + q;
        }
        avg = sum / p;

        if (avg >= 90 && avg <= 100) {
            System.out.println("GRADE O");
        } else if (avg >= 80 && avg <= 90) {
            System.out.println("GRADE E");
        } else if (avg >= 70 && avg <= 80) {
            System.out.println("GRADE A");
        } else if (avg >= 60 && avg <= 70) {
            System.out.println("GRADE B");
        } else if (avg >= 50 && avg <= 60) {
            System.out.println("GRADE C");
        } else if (avg >= 40 && avg <= 50) {
            System.out.println("GRADE D");
        } else {
            System.out.println("GRADE F");

        }
    }
}