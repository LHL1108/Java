public class Mytest11{
	public static double power(double base, int exponent) {
		double result = 0.0;
		if (equal(base,0.0)&&(exponent < 0)) {
			throw new RuntimeException("invalid input");
		}
		if (exponent < 0) {
			result = powerWithExponent(1.0/base, -exponent);
		}
		else {
			result = powerWithExponent(base, exponent);
		}
		return result;
	}
	
	private static double powerWithExponent(double base, int exponent) {
		double result = 1.0;
		for (int i = 1; i <= exponent; i++) {
			result *= base;
		}
		return result;
	}
	
	private static boolean equal(double num1, double num2) {
		if ((num1-num2 > -0.0001) && (num1-num2 < 0.0001)) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	public static void main (String[] args) {
		
		System.out.println(power(2.0, -2));
		
	}	
}