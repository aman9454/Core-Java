class PalindromeNum
{
	static boolean palindrome(int n)
	{
		int num=0;
		int temp=n;

		while(n>0)
		{
			int rem=n%10;
			num=num*10+rem;
			n=n/10;
		}
		return num==temp;
	}
	public static void main(String[] args)
	{
		int n=121;
		System.out.println(palindrome(n));
	}
}