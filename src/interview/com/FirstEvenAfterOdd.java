package interview.com;

import java.util.Arrays;

public class FirstEvenAfterOdd {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		int[] arr= {1,2,5,47,8,11,20};
//		evenOdd(arr);
//	}
//	
//	
//	public static void evenOdd(int arr[]) {
//		int a[]=new int[arr.length];
//		int index=0;
//		for(int i=0;i<arr.length;i++) {
//			if(a[i]%2==0) {
//				a[index]=arr[i];
//			index++;
//		}
//		}
//		for(int i=0;i<arr.length;i++) {
//			if(a[i]%2!=0) {
//				a[index]=arr[i];
//			index++;
//		}
//		}
//		
//		for(int i=0;i<a.length;i++) {
//			System.out.print(a[i]+" ");
//		}
//	}
//
//}
	
	public static void main(String[] args) {

		int[] a = { 2, 3, 4, 6, 7, 5, 9, 10 };
		int[] b = new int[a.length];
		int index = 0;
		Arrays.sort(a);
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				b[index] = a[i];
				index++;
			}
		}
//		Arrays.sort(a);
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 != 0) {
				b[index] = a[i];
				index++;
			}
		}
		
		for(int i=0;i<b.length;i++) {
			System.out.print(b[i]+" ");
		}
	}

}