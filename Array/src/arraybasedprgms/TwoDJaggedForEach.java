package arraybasedprgms;

import java.util.Scanner;

public class TwoDJaggedForEach {

	public static void main(String[] args) {
		System.out.println("Enter Number of classrooms:");
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		int c=sc.nextInt();
		int[][] a=new int[c][];
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Enter no. of students in class"+(i+1));
			int st=sc.nextInt();			
			a[i]=new int[st];
			for(int j=0;j<a[i].length;j++)
			{
				System.out.println("Enter Marks of Student"+(j+1));
				a[i][j]=sc.nextInt();
			}
		}
	int res=0;
	for(int[] i:a)
	{
		res++;
		System.out.println("---"+"Class"+(res)+"---");
	 for(int j:i)
	 {
	 System.out.print(j+" ");
	 }
	System.out.println();	
	}
	}
}

