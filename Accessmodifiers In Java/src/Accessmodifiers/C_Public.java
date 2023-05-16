package Accessmodifiers;

public class C_Public extends B{
	
	public static void main(String[] args) {
		
		C_Public obj = new C_Public();
		int output = obj.x;
		
		System.out.println(output);
		
		obj.b1();
	}

}
