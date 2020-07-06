package arraybasedprgms;

import java.util.Scanner;

public abstract class ThreeDarray {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number of Schools:");
		int sh=scan.nextInt();
		System.out.println("Enter number of Classes:");
		int cl=scan.nextInt();
		System.out.println("Enter number of students per class:");
		int st=scan.nextInt();
		int[][][] a=new int[sh][cl][st];
		/*for(int i=0;i<a.length;i++) 
			{
			System.out.println("School "+(i+1));
			for(int j=0;j<a[i].length;j++)
			{
				System.out.println("Class" +(j+1));
				for(int k=0;k<a[i][j].length;k++) {
					System.out.println("Enter Student "+(k+1)+" Marks");
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
	}*/
		for(int i=0;i<a.length;i++) 
		{
		System.out.println("School "+(i+1));
		for(int j=0;j<a[i].length;j++)
		{
			System.out.println("Class" +(j+1));
			for(int k=0;k<a[i][j].length;k++) {
				System.out.println("Enter Student "+(k+1)+" Marks");
				a[i][j][k]=scan.nextInt();
			}
			
		}
		System.out.print("---------------------");
	}
	for(int i=0;i<a.length;i++) 
	{
	for(int j=0;j<a[i].length;j++)
	{
		for(int k=0;k<a[i][j].length;k++) {
			System.out.print(a[i][j][k]+" ");
		}
		System.out.println();
		
	}
}

	}

}
