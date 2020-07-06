package arraybasedprgms;

import java.util.Scanner;

public class Max_diff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[] a=new int[9];
		int max_value=0,index1=0,index2=0;
		System.out.println("Enter elements to array:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length-1;j++)
			{
			int diff=Math.abs(a[i]-a[j]);
				if(diff>max_value)
				{
					max_value=diff;
					index1=a[i];
					index2=a[j];
				}
		    }
		}
		System.out.println("Greatest absolute Difference is:"+max_value+
				"between elements:"+index1+" and "+index2);
	}

}
