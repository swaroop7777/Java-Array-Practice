package arraybasedprgms;

import java.util.Scanner;

public class AscendSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of elements into the array:");
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]>a[j])
				{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				}
			}
		}
		for(int i=0;i<n;i++)
		System.out.print(a[i]+" ");
	}

}
