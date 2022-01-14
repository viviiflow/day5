package day5;

import java.util.Scanner;
import java.util.Random;

public class NumGame {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();

		int[] front = { 1, 1, 2, 2, 3, 3, 4, 4, 5, 5 };
		int[] back = new int[10];
		int cnt = 0, x = 0;

		while (x < 1000) {
			int r = ran.nextInt(10);
			int temp = front[0];
			front[0] = front[r];
			front[r] = temp;
			x++;
		}

		while (true) {
			for (int i = 0; i < back.length; i++) {
				if (back[i] != 0) {
					cnt++;
				} else
					cnt = 0;
			}

			System.out.println("<front>");
			for (int j = 0; j < front.length; j++) {
				System.out.print(front[j] + " ");
			}
			System.out.println("");

			System.out.println("<back>");
			for (int n = 0; n < back.length; n++) {
				System.out.print(back[n] + " ");
			}
			System.out.println("");

			if (cnt == 10) {
				break;
			}

			System.out.println("입력1:");
			int num1 = sc.nextInt();
			System.out.println("입력2:");
			int num2 = sc.nextInt();

			if (front[num1] == front[num2]) {
				back[num1] = front[num1];
				back[num2] = front[num2];
			} else
				continue;

		}
		System.out.println("게임이 끝났습니다.");

	}
}
