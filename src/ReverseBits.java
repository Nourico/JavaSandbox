
public class ReverseBits {

	public static long reverse(int number, int power) {
		if (number == 0)
			return 0;
		int newNumber = number / 2;
		
		return (long) Math.pow((number % 2) * 2, power ) + reverse(newNumber, power-1);
	}
	
	public static void main(String[] args) {
		System.out.println(reverse(-100, 31));

	}

}
