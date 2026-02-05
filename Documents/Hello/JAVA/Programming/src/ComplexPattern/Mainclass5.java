package ComplexPattern;

public class Mainclass5 {
	public static void main(String[] args) {
	int n=7;
	int sp=0; 
	int  st= n/2+1;
	
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=st;j++)
		{
			System.out.print("* ");
		}
		for(int k=1;k<=sp;k++)
		{
			System.out.print("  ");
		}
		if(i<=n/2)
		{
			st--;
			sp++;
			
		}
		else {
			st++;
			sp--;
		}
		System.out.println();
	}
}
}
