class Unary
{
	public static void main(String[] args)
	{
		int x=20;
		int y=19;
		int z=31;

		x= x++ + ++y + z++;
		y= y++ + ++y + ++z;
		z= z++ + ++z + x++;

		System.out.println(x);
		System.out.println(y);
		System.out.println(z);


	}
}