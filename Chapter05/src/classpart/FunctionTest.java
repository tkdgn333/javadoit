package classpart;

public class FunctionTest {

	public static void main(String[] args) {
		int num1 = 20;
		int num2 = 10;
		int sum = 0;
		
		sum = add(num1, num2);
		System.out.println(num1 + " + " + num2 + " = " + sum + "입니다");
		sum = sub(num1, num2);
		System.out.println(num1 + " - " + num2 + " = " + sum + "입니다");
		sum = mul(num1, num2);
		System.out.println(num1 + " * " + num2 + " = " + sum + "입니다");
		sum = div(num1, num2);
		System.out.println(num1 + " / " + num2 + " = " + sum + "입니다");
	}
	
	public static int add(int n1, int n2) {
		int result = n1 + n2;
		return result;
	}
	public static int sub(int n1, int n2) {
		int result = n1 - n2;
		return result;
	}
	public static int mul(int n1, int n2) {
		int result = n1 * n2;
		return result;
	}
	public static int div(int n1, int n2) {
		int result = n1 / n2;
		return result;
	}

}
