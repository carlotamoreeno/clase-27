
public class EqualStrings {

	public static void main(String[] args) {
		String first = "Uda";
		String second = "city";
		String firstAndSecond = first + second;
		String third = "Udacity";
		if (firstAndSecond.contentEquals(third)) { //  == solo numeros int osea enteros hay que poner un equals
			System.out.println("They are the same");
		} else {
			System.out.println("firstAndSecond is " + firstAndSecond);
		}
	}

}
