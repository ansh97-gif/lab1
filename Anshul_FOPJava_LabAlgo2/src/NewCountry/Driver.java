package NewCountry;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		try(Scanner s=new Scanner(System.in)){
			System.out.println("Enter the size of currency denominations");
			int size=s.nextInt();
			int[] denomination=new int[size];
			System.out.println("Enter the currency denominations value");
			for(int i=0;i<size;i++) {
				denomination[i]=s.nextInt();
			}
			System.out.println("Enter the amount you want to pay:");
			int amount=s.nextInt();
			Traveler t=new Traveler();
			t.minNotes(denomination, amount);
			
		}

	}

}
