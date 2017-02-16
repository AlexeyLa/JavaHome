
public class TestVars {

	static char a = 65;
	static char b = 66;
	static char c = '\u0041'; // 4*16^1 + 1*16^0 = 65 = A
	static char c2 = 0x41; // 4*16^1 + 1*16^0 = 65 = A
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print(a);
		System.out.print(b);
		System.out.print(c);
		System.out.print(c2);
		
	}

}
