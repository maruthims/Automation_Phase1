package JavaSessions;

public class StaticAndNonStaticSession {

	int age = 12;
	String countryName = "INDIA";
	static String carName = "MARUTI";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(carName);
		country();
		System.out.println(StaticAndNonStaticSession.carName);
		System.out.println(TestUtil.days);
		TestUtil.getTime();
		StaticAndNonStaticSession obj = new StaticAndNonStaticSession();
		System.out.println(obj.age);
		System.out.println(obj.carName);
		System.out.println();
		}

	public void brand() {
		System.out.println("brand method");
	}
	
	public static void country() {
		System.out.println("INDIA");
		
	}
}
