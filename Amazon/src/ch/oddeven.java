package ch;

public class oddeven {

	public static void main(String[] args) {
		int a =21;
		String result=odev(a);
		System.out.println(result);
		
		
	}
		public static String odev(int a)
		{
				if (a%2==0) {
					return "odd";
					
				}
				else {
					return "even";
				}

	}

}
