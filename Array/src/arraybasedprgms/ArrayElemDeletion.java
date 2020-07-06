package arraybasedprgms;

import java.util.Scanner;

public class ArrayElemDeletion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of elements into the array:");
		int n=sc.nextInt();
		int[] a=new int[n];
		int[] b=new int[n-1];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter element you want to remove");
		int elem=sc.nextInt();
		int index=0;
		for(int i=0;i<n;i++)
		{
			if(a[i]!=elem)
			{
				b[index]=a[i];
				index++;
			}
		}
		for(int i=0;i<n-1;i++)
		System.out.print(b[i]+" ");
	}

}
/*MY LOGIC FOR THIS PROGRAM

package p2;
import java.util.Scanner;
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of elements into the array:");
		int n=sc.nextInt();
		int[] a=new int[n];
		int[] b=new int[n-1];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter element you want to remove");
		int elem=sc.nextInt();
		int k=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=elem)
			{
				k++;
				b[i]=a[i];
			}
			else
				break;
		}
		for(int i=k;i<(a.length);i++)
		{
			if(i<a.length-1)
			{
				b[i]=a[i+1];
			}
			else
				break;
		}
		for(int i=0;i<a.length-1;i++)
		System.out.print(b[i]+" ");
	}
}*/
