package package1;

public class ClassB extends A {
	
	@Override
	
	public void m2() {
		
		System.out.println("m2");

	}

	public static void main(String[] args) {
		
		A a = new A();
		
		a.m1();
		
		a.m2();
		
		

	}

}
