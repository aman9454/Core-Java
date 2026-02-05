package ComplexPattern;

public class MainClass4 {
	public static void main(String[] args) {
		int n=7;
		int sp=n/2, st=1;
		
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
				sp--;
				st=st+1;
				
			}
			else {
				sp++;
				st=st-1;
			}
			System.out.println();
		}
	
		
	}

}
