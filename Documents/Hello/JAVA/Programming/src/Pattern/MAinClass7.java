package Pattern;

public class MAinClass7 {
public static void main(String[] args) {
	int count=1;
	char ch='A';
		
		for(int i=1;i<=5;i++)
		{
			
			for(int j=1;j<=i;j++)
			{
				if(i%2!=0) {
				System.out.print(count+" ");
				}
				
				else if(i%2==0)
				{
					System.out.print(ch+" ");
				}
			}
			count++;
			ch++;
			System.out.println();
		}
	}
}
