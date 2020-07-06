package arraybasedprgms;
import java.util.Scanner;
public class Twodarray {

	public static void main(String[] args) {
		int[][] a=new int[2][5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Elements into 2D Array:");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		for(int[] i: a)
		{
			for(int j:i) {
				System.out.println(j);
			}
		}
		// TODO Auto-generated method stub

	}

}
