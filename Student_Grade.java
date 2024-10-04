package code_alpha;

import java.util.Scanner;

public class Student_Grade {

	public static void main(String[] args) {
		String grade;
		String thought;
		double average;
		double total=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of Student: ");
		int count = sc.nextInt();

		int arr[] = new int[count];

		for (int i = 0; i < count; i++) {
			System.out.println("Enter marks of student" + (i + 1) + ": ");
			arr[i] = sc.nextInt();
			total +=arr[i];
              
		}

		for (int i = 0; i < count; i++) {
			if (arr[i] >= 90 && arr[i] <= 100) {
				grade = "A+";
				thought = "Excellent work! You’ve mastered this subject. Keep striving for greatness!";
			} else if (arr[i] >= 80 && arr[i] < 90) {
				grade = "A";
				thought = "Great job! Your hard work is clearly paying off.";
			} else if (arr[i] >= 70 && arr[i] < 80) {
				grade = "B+";
				thought = "Good effort! Keep pushing, and you’ll reach even higher.";
			} else if (arr[i] >= 60 && arr[i] < 70) {
				grade = "B";
				thought = "Well done! Consistency is key, and you’re on the right path.";
			} else if (arr[i] >= 50 && arr[i] < 60) {
				grade = "C";
				thought = "You’ve made it! Keep focusing, and improvements will follow.";
			} else if (arr[i] >= 40 && arr[i] < 50) {
				grade = "D";
				thought = "You passed! Don’t stop here, aim higher next time!";
			} else if (arr[i] >= 0 && arr[i] < 40) {
				grade = "F";
				thought = "Don't get discouraged! Failure is just a stepping stone. Keep learning and improving!";
			} else {
				grade = "Invalid";
				thought = "Please enter valid marks between 0 and 100.";
			}

			System.out.println("Grade of student" + (i + 1) + ": " + grade);
			System.out.println(thought);
			System.out.println(" ");
			System.out.println("--------------------------------------------------------------------");

			
			
			
			
		}
		int min = arr[0];
	     int max = arr[0];

	      
	      for (int i = 1; i < arr.length; i++) {
	          if (arr[i] < min) {
	              min = arr[i]; // Update minimum
	          }
	          if (arr[i] > max) {
	              max = arr[i]; // Update maximum
	          }
	      }
	      
	      
	      
	      average= total/count;
	      System.out.printf("Average marks of all student: %.2f", average);
	     System.out.println("  ");
	     System.out.println("--------------------------------------------------------------------");

	      // Print the minimum and maximum values
	      System.out.println("Lowest score : "+ min);
	      System.out.println("Highest score: " +max);
	  

	}
}
