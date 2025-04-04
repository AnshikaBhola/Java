package Day15;

public class CalcDriver {

	public static void main(String[] args) {
		Calc c = new AdvCalc();
		double ans = c.calculate(6, 2, '%');
		System.out.println(ans);

	}

}
