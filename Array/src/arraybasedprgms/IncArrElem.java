package arraybasedprgms;

import java.util.Scanner;

public class IncArrElem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of elements into the array:");
		int n=sc.nextInt();
		int[] a=new int[n];
		int[] b=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			b[i]=a[i]+1;
		}
		for(int i=0;i<n;i++)
		System.out.print(b[i]+" ");

	}

}
