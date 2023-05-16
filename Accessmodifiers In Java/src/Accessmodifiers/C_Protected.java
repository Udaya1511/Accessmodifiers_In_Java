package Accessmodifiers;

public class C_Protected extends B{
	
	public static void main(String[] args) {
		C_Protected obj = new C_Protected();
		int output = obj.z;
		
		System.out.println(output);
		
		obj.protectedMethod();
	}
	
	
}
