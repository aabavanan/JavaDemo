package DemoPackage;

public class AddSum{
	
	public void Addition() {
		int x = 5;
		int y = 6;
		
		int z = x + y;
		
		System.out.println("Addition Results - " + z );
	}
	
	public static void main(String[] args) {
		
		AddSum obj = new AddSum();
		obj.Addition();
		
	}

}