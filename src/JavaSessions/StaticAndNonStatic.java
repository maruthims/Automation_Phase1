package JavaSessions;

public class StaticAndNonStatic {

	static int a = 250000;
	static int b = 500000;
	public static void main(String[] args) {
	
		System.out.println(a);
		int w = wheel();
		
	StaticAndNonStatic obj = new StaticAndNonStatic();
	String car = obj.carBrand("MARUTI");
	System.out.println(car);
	System.out.println("It has " + w +" Wheels");
	System.out.println("The price of this car is between Rs: "+a +"  and Rs : "+b);
		}

	public void brand() {
		System.out.println("MARUTI");
	}
	public static int wheel() {
		int wheel = 4;
		return wheel;
	}
	public String carBrand(String brand) {
		if(brand.equals("MARUTI")) {
			return brand + " IS MADE IN INDIA";
			
		}
		return brand;
	}
}
