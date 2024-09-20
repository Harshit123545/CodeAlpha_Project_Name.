import java.util.Scanner;

public class GradesCalculator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
  
        int[] grades = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter grade for student " + (i + 1) + ": ");
            grades[i] = sc.nextInt();
        }
        int sum = 0, high = grades[0], low = grades[0];
        for (int i = 0; i < n; i++) {
            sum += grades[i];
            if (grades[i] > high) {
                high = grades[i];
            }
            if (grades[i] < low) {
                low = grades[i];
            }
        }
        
        double avg = (double) sum / n;
        
        System.out.println("\nAverage: " + avg);
        System.out.println("Highest: " + high);
        System.out.println("Lowest: " + low);
        
        sc.close();
    }
}
