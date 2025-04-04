package Day15;

public class BasicCalc implements Calc {

	public double calculate(double num1, double num2, char op) {
		switch(op) {
		case '+':{
			double ans=num1+num2;
			return ans;
		}
		case '-':{
			double ans=num1-num2;
			return ans;
		}
		case '*':{
			double ans=num1*num2;
			return ans;
		}
		case '/':{
			double ans=num1/num2;
			return ans;
		}
		default:
			return -1.0;
		}


		
	}

}
