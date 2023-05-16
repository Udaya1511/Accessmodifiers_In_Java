package Accessmodifiers;

class B {

	int x = 100;
	public void b1() {
		System.out.println("This is just a print method");

	}

	protected int z =200;

	protected void protectedMethod() {

		System.out.println("This is the protected method");

	}

	public static class C_Default {

		public static void main(String[] args) {

			B obj = new B();
			int z2 = obj.z;		
			System.out.println("The value of z is :" + z2);
			obj.b1();
			obj.protectedMethod();


		}
	}


}
