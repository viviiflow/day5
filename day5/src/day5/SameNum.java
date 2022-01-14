package day5;

import java.util.Scanner;

public class SameNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] check = new int[5];
		int[] arr = new int[5];
		int cnt=0;

		

		for (int i = 0; i < arr.length;) {
			System.out.print("랜덤숫자: ");
			int ran = sc.nextInt();
			
			if (check[ran] != 1) {
				check[ran] = 1;
				arr[i] = ran;
				System.out.print("check = {");
				for (int x = 0; x < check.length; x++) {
					System.out.print(check[x] + " ");
				}
				System.out.println("}");
				
				System.out.print("arr = {");
				for (int y = 0; y < arr.length; y++) {
					System.out.print(arr[y]+" ");
				}
				System.out.println("}");
				
				i++;
			}
			else System.out.println("중복된 숫자 입니다.");
			for (int j= 0; j < arr.length; j++) {
				if (arr[j]!=0) {
					cnt++;
				}
				else cnt=0;
				
			}
			if(cnt==5) {
				break;
			}
		}
		System.out.println("-end-");

	}
}
