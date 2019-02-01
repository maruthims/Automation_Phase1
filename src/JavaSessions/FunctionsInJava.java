package JavaSessions;

import java.util.ArrayList;

public class FunctionsInJava {

	public static void main(String args[]) {
		
		FunctionsInJava obj = new FunctionsInJava();
		obj.one();
		String s1 = obj.two();
		System.out.println(s1);
		int m = obj.multiply();
		System.out.println(m);
		ArrayList<String> ar1 = obj.getEmployeeName();
		System.out.println(ar1);
		int sal1[] = obj.getSal();
		for(int d=0;d<sal1.length;d++) {
		System.out.println(sal1[d]);
		}
		
		int e = obj.getMultiply(15,35);
		System.out.println(e);
		int f = obj.getAddition(100,35);
		System.out.println(f);
		int g = obj.getSubtraction(100,35);
		System.out.println(g);
		int h = obj.getDivision(100,20);
		System.out.println(h);
		String country = obj.getCountryName("Sydney");
		System.out.println(country);
		String firstName = obj.getLastName("David");
		System.out.println(firstName);
	}
	
	public void one() {
		System.out.println("No Input and No Return");
	}
	
	public String two() {
		System.out.println("Your Last Name");
		String s = "Racherla";
		return s;
	}
	
	public int multiply() {
		System.out.println("Multiplication Method");
		int x = 10;
		int y = 20;
		int z = x*y;
		System.out.println(y);
		return z;
	}
	
	public ArrayList<String> getEmployeeName() {
		ArrayList<String> ar = new ArrayList<String>();
			ar.add("Shyamanth");
			ar.add("Dheemanth");
			ar.add("Maruthy");
			ar.add("Krishnaveni");
			return ar;
		
	}

	public int[] getSal() {
		int sal[] = new int[4];
		sal[0] = 1000;
		sal[1] = 2000;
		sal[2] = 6000;
		sal[3] = 8000;
		return sal;
		
	}
	
	public int getMultiply(int a, int b) {
		System.out.println("Some Input and some return - Multiply method");
		int c = a*b;
		return c;
		
	}
	public int getAddition(int a, int b) {
		System.out.println("Some Input and some return - Addition method");
		int j = a+b;
		return j;
	}
	public int getSubtraction(int a, int b) {
		System.out.println("Some Input and some return - Subtraction method");
		int j = a-b;
		return j;
	}
	public int getDivision(int a, int b) {
		System.out.println("Some Input and some return - Subtraction method");
		int j = a/b;
		return j;
	}
		
	public String getCountryName(String cityName) {
		System.out.println("getCountryName");
		if(cityName.equals("Bangalore")){
			return "Country name is India for city "+ cityName;
		}
		else if(cityName.equals("Paris")){
			return "Country name is Franse for city "+ cityName;
	}else if(cityName.equals("Houston")){
			return "Country name is USA for city "+ cityName;
	}else if(cityName.equals("Sydney")){
		return "Country name is Australia for city "+ cityName; 
	}
		return cityName + " No city found. WIll be added later";
		
	}
	public String getLastName(String lastName) {
		System.out.println("First Name");
		if(lastName.equals("John")){
			return "First name is Collis for "+ lastName;
		}
		else if(lastName.equals("David")){
			return "First name is Edward for "+ lastName;
	}else if(lastName.equals("Leah")){
			return "First name is Ramey for "+ lastName;
	} 
		return lastName +" not found. Will be added Later";
		
	}
}

