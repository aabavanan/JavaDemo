package DemoPackage;

public class MyBike{
	
	public void Yamaha() {
		System.out.println("My bike is - FZ");
	}
	
	public static void main(String[] args) {
		
		Mycar mycar = new Mycar();
		MyBike myBike = new MyBike();
		
		mycar.maruthiCar();
		mycar.tataCar();
		
		myBike.Yamaha();
	}

}
