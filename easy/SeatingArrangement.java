/*
Author: Abhishek Kansal
Problem: https://codebuddy.co.in/problems/SEATING
*/

package easy;
import java.util.Scanner;

public class SeatingArrangement {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int T = scn.nextInt();
		while (T-- > 0) {
			int num = scn.nextInt();
			int m = scn.nextInt();

			int count = m;
			int window = 1;
			int notWindow = 2 * num + 1;
			
			while (count > 0) {
				if (count == 0) {
					break;
				}
				if (notWindow <= m) {
					System.out.print(notWindow + " ");
					notWindow++;
					count--;
				}
				if (count == 0) {
					break;
				}
				if (window <= m) {
					System.out.print(window + " ");
					window++;
					count--;
				}
			}
			System.out.println();
		}
		scn.close();
	}
	
}
