package exception;

public class Methods {
	int number_a;
	int number_b;

	public void Numbers() {
		System.out.println("input number 1");
		number_a = Main_Exceptin.scanner.nextInt();
		System.out.println("input number 2");
		number_b = Main_Exceptin.scanner.nextInt();
		showingException();
	}

	public void showingException() {
		try {
			if (number_a < 0 && number_b < 0) {
				throw new My_Exceptions(
						ExceptionMassages.ILLIAGAL_ARGUMENT_EXCEPTION);
			}if ((number_a == 0 && number_b != 0)
					|| (number_a != 0 && number_b == 0)) {
				throw new My_Exceptions(ExceptionMassages.ARITHMETIC_EXCEPTION);
			}if (number_a == 0 && number_b == 0) {
				throw new My_Exceptions(
						ExceptionMassages.ILLIAGAL_ACCESS_EXCEPTION);
			}if (number_a > 0 && number_b > 0) {
				throw new My_Exceptions(ExceptionMassages.MY_EXCEPTION);
			}
		} catch (My_Exceptions e) {
			System.out.println(e.getMessage());
		}
	}
}