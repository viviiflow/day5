package day5;

import java.util.Scanner;

public class controler {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = { 10, 20, 0, 0, 0 };

		while (true) {
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] == 0) {
					continue;
				}
				System.out.print(arr[i] + " ");
			}
			System.out.println("");
			System.out.println("[1] �߰�");
			System.out.println("[2] ����");
			System.out.println("[3] ����");
			System.out.println("[0] ����");
			System.out.println("�޴� ����:");
			int slt = sc.nextInt();

			if (slt == 1) {
				System.out.println("�߰��� �� �Է�:");
				int num = sc.nextInt();
				for (int i = 0; i < arr.length; i++) {
					if (arr[i] == 0) {
						arr[i] = num;
						break;
					}

				}
				continue;
			}

			else if (slt == 2) {
				System.out.println("������ �� �Է�:");
				int num = sc.nextInt();
				for (int i = 0; i < arr.length; i++) {
					if (arr[i] == num) {
						arr[i] = 0;
						for (int x = i + 1; x < arr.length; x++) {
							arr[x - 1] = arr[x];
						}
					}
				}
				continue;
			}

			else if (slt == 3) {
				System.out.println("������ ��ġ �Է�:");
				int point = sc.nextInt();
				System.out.println("������ �� �Է�:");
				int num = sc.nextInt();
				for (int i = arr.length - 2; i >= 0; i--) {
					if (i > point) {
						arr[i + 1] = arr[i];
					} else if (i == point) {
						arr[i + 1] = arr[i];
						arr[i] = num;
					}
				}
				continue;
			}

			else if (slt == 0) {
				System.out.println("���α׷��� �����մϴ�.");
				break;

			}
		}

	}
}
