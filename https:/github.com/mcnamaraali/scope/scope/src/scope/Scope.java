package scope;

public class Scope {
	
	//class variable aka field
	private static int x = 100;

	public static void main(String[] args) {
		int x = 5;
		
		System.out.printf("local x in main is %d", x);
		
		useLocalVariable();
		useField();
		useLocalVariable();
		useField();
		
		System.out.printf("%n Local x in main is %d", x);

	}
	
	public static void useLocalVariable() {
		int x = 25;
		System.out.printf("%n Local x on entering useLocalVariable %d%n", x);
		++x;
		System.out.printf("%n Local x before exiting useLocalVariable %d%n", x);
		
	}
	
	public static void useField() {
		System.out.printf("%n Local x on entering useField %d%n", x);
		x *= 10;
		System.out.printf("%n Local x before exiting useField %d%n", x);
		
	}

}
