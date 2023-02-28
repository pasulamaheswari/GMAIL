package package1;

public class  Implements I3 {
	
	@override
	public void m1() {
		System.out.println("m1");
	}
	@override
	public void m2() {
		
		System.out.println("m2");
	}
	@override
	public void m3() {
		System.out.println("m3");
	}

	public static void main(String[] args) {
		
		I3 i3 = new Impl();
		
		i3.m1();
		
		i3.m2();
		i3.m3();

	}

}
