class BitwiseShift
{
	public static void main(String[] args)
	{
		///////// Left Shift ///////////

		int a=13;   // Multiply by 2 
		System.out.println(a<<1);   //. Left Shift 

		int p=23; //23*2 = 46.  46*2=92. 
		System.out.println(p<<2);

		int b=9;
		System.out.println(b<<3);

		int c=19;
		System.out.println(c<<3);
		System.out.println();

		////////// Right Shift /////////

		int x=25;  // divide by 2
		System.out.println(x>>1);

		int y=27; 
		System.out.println(y>>1);

		int z=25;  // 25/2=12   12/2=6
		System.out.println(z>>2);

		int q=83;  
		System.out.println(q>>2);

		int r=150;  
		System.out.println(r>>3);

		int o=27;
		System.out.println(o>>3);
	}
}