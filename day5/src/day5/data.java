package day5;
import java.util.Arrays;
import java.util.Scanner;
public class data {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	int[] a= {10,20,30,40,50};
	System.out.println("�� 2���� �Է¹޾� �� ��ü�ϱ�");
	System.out.println("��1 �Է�:");
	int in1=sc.nextInt();
	System.out.println("��2 �Է�:");
	int in2=sc.nextInt();
	
	int d1=Arrays.binarySearch(a, in1);
	int d2=Arrays.binarySearch(a, in2);
	
	/* int check1 = 0;
	int check2 = 0;
	
	for(int i=0; i<5; i++)
	{
		if(arr[i] == value1)
		{
			check1 = i;
		}
		if(arr[i] == value2)
		{
			check2 = i;
		}
	}*/

	int temp=a[d1];
	a[d1]=a[d2];
	a[d2]=temp;
	
	System.out.print("[");
	for(int i=0; i<a.length; i++) {
		System.out.print(a[i]+" ");
	}
	System.out.print("]");

}
}