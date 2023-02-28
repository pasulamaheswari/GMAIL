package package1;

public class Test {
	
	private int index;
	
	public Test() {
		
		index = 0;
	}
	
	public Test(int index) {
		
		this.index = index;
	}
	
	public Test(double index) {
		
		this.index = (int)index;
	}
	
	public void display() {
		
		System.out.println("index =" +index);
		
	}

	public static void main(String[] args) {
		
		Test t1 = new Test();
		
		t1.display();
		
		Test t2 = new Test(100);
		
		t2.display();
		
		Test t3 = new Test(99.99);
		
		t3.display();

		
	}

}
