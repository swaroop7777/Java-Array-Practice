package arraybasedprgms;

import java.util.Scanner;

public class ThreeDJagged {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number of Schools:");
		int sh=scan.nextInt();
		int[][][] a=new int[sh][][];
		for(int i=0;i<a.length;i++) 
		{
		System.out.println("Enter number of Classes for school"+(i+1));
		int cl=scan.nextInt();
		a[i]=new int[cl][];
			for(int j=0;j<a[i].length;j++) 
			{
				System.out.println("Enter number of students for class" +(j+1)+"of school"+(i+1));
				int st=scan.nextInt();
				a[i][j]=new int[st];
				for(int k=0;k<a[i][j].length;k++) 
				{
					System.out.println("Enter the marks of Student"+(k+1));
					a[i][j][k]=scan.nextInt();
					
				}
			}
				
		}
		for(int i=0;i<a.length;i++) 
		{
		System.out.println("School "+(i+1)+" Details:");
		for(int j=0;j<a[i].length;j++)
		{
			System.out.println("Class "+(j+1)+" Details");
			for(int k=0;k<a[i][j].length;k++) {
				System.out.println("Student "+(k+1)+"Marks :"+a[i][j][k]);
			}
			
		}
		
	}
  }
}

