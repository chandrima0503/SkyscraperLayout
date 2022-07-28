package com.greatlearning.skyscraper;
import java.util.Scanner;
import java.util.Stack;

public class skyscraper {
	
	public void floorGenerator() {
		Scanner sc = new Scanner(System.in);

		Stack<Integer> floor = new Stack<Integer>();
		
		int count, size;
		
		System.out.println("Enter the total number of floors in the building");
		
		count = sc.nextInt();
		
		int floorArray[] = new int[count];
		int base = count;
		
		for (int i=0; i<count; i++) {
			System.out.println("Enter the floor size given on day :"+(i+1));
			size = sc.nextInt();
			floorArray[i] = size;
		}
		
		System.out.println("The order of construction is as follows");

		for (int i = 0; i < count; i++) {
			System.out.println("\nDay : " + (i + 1));
			floor.push(floorArray[i]);

			for (int j = 0; j < count; j++) {
				if (floor.empty()) {
					break;
				}
				if (floor.peek() == base) {
					System.out.printf(floor.pop() + " ");
					base--;
				}
			}

		}
		
		sc.close();
	}
}
