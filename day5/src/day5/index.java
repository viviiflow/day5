package day5;
import java.util.Scanner;
public class index {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	int[] a= {10,20,30,40,50};
	System.out.println("인덱스 2개를 입력받아 값 교체하기");
	System.out.println("인덱스1 입력:");
	int in1=sc.nextInt();
	System.out.println("인덱스2 입력:");
	int in2=sc.nextInt();
	
	int n1=a[in1], n2=a[in2];
	a[in1]=n2;
	a[in2]=n1;
	
	/*int temp = arr[idx1];
	arr[idx1] = arr[idx2];
	arr[idx2] = temp; */

	
	System.out.print("[");
	for(int i=0; i<a.length; i++) {
		System.out.print(a[i]+" ");
	}
	System.out.print("]");
	
}
}
