package JavaSessions;

public class MainMethodOverloading {

	public static void main(String[] args) {
		System.out.println("Main method");// TODO Auto-generated method stub
		main(10);
		main(10,30);
	}

	public static void main(int a) {
System.out.println("Second Method");
System.out.println(a);
}

	public static void main(int x, int y) {
		System.out.println("Third Method");
		System.out.println(x+y);
		}

}
