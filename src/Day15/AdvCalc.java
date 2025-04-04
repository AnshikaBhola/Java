package Day15;

public class AdvCalc extends BasicCalc {

	public double calculate(double num1, double num2, char op) {
		switch (op) {
		case '^': {
			return java.lang.Math.pow(num1,num2);
//			double ans = 1;
//			for (int i = 1; i <= num2; i++) {
//				ans = ans * num1;
//			}
//			return ans;
		}
		case '%': {
			double ans = num1 % num2;
			return ans;
		}
		default: {
			return super.calculate(num1, num2, op);
		}

		}
	}

}
