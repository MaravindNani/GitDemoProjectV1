package nani;

import java.util.Scanner;

public class Test1 {
     public static void main(String[] args) {
		    try (Scanner s = new Scanner(System.in)) {
				System.out.println("Enter Number");
				int v = s.nextInt();
				int count = 0;
				for(int i =1;i<=v/2;i++) {
					if(v%i==0) {
						count++;
					}
				}
				if(count>=2) {
					System.out.println(v +" is not a prime member");
				}
				else {
					System.out.println(v +" is a prime number");
				}
			}

		}

	}
