package paymoney;

import java.util.Scanner;

public class DriverClass {


	public static void main(String[] args) {
		try(Scanner s=new Scanner(System.in)){
		System.out.println("Enter the size of transaction array: ");
		int sizeArray=s.nextInt();
		int[] arr=new int[sizeArray];
		System.out.println("Enter the value of array");
		for(int i=0;i<sizeArray;i++) {
			arr[i]=s.nextInt();
		}
		System.out.println("Enter total number of targets: ");
		int total_targets=s.nextInt();
		for(int i=0;i<total_targets;i++) {
			System.out.println("Enter the value of targets: ");
			int target=s.nextInt();
			PayMoney pay=new PayMoney();
			pay.transactions(arr, target);
		}
        }
		
    }

}
