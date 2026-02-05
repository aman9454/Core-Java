package module1;

public class MainClass3 {
	public static void main(String[] args) {
		int a[]= {9,16,7};
		for(int i=0; i<=a.length-1;i++)
		{
			int next = getNextPrime(a[i]+1);
			int prev = getPrevPrime(a[i]-1);
			System.out.println(next-prev);
		}
	}
	static int getNextPrime(int n) {
		while(true)
		{
			if(isPrime(n))
			return n;
			n++;
		}
	}
	static int getPrevPrime(int n) {
		while(true)
		{
			if(isPrime(n))
			return n;
			n--;
		}
	}
	static boolean isPrime(int n)
	{
		if(n<=1)
			return false;
		for(int i=2; i<=n/2;i++)
		{
			if(n%i==0)
			return false;
		}
		return true;
	}

}
