class Program7
{
	public static void main(String[] args)
	{
		String str="j2ee";

		System.out.println(str.equals("adv java"));
		System.out.println(str.equals("j2ee"));
		System.out.println(str.equals("J2ee"));

		System.out.println(str.equalsIgnoreCase("Adv JAva"));
		System.out.println(str.equalsIgnoreCase("J2EE"));
		System.out.println(str.equalsIgnoreCase("j2Ee"));
	}
}