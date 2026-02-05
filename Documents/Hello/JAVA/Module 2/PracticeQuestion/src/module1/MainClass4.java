package module1;

import java.util.Arrays;

public class MainClass4 {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6};
		int b[]= new int [a.length];
		int in=0;
		
		for(int i=0; i<=a.length-1;i++)
		{
			if(a[i]%2==0)
			{
				b[in]=a[i];
				in++;
			}
		}
		for(int i=0; i<=a.length-1; i++)
		{
			if(a[i]%2==1)
			{
				b[in]=a[i];
				in++;
			}
		}
		System.out.println(Arrays.toString(b));
	}
}
