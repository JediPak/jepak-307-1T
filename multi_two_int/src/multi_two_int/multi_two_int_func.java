package multi_two_int;

public class multi_two_int_func {
	public static void main(String[] args){
		int result = 0;
		result = multi_two_int(3, 6);
		System.out.println("result: " + result);
	}
	public static int multi_two_int(int num1, int num2) {
		return num1 + num2;
	}
}
