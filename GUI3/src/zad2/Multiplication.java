package zad2;

import java.math.BigDecimal;

public class Multiplication implements Calculation {

	@Override
	public String calculate(BigDecimal arg1, BigDecimal arg2) {
		return arg1.multiply(arg2).toString();
	}

}
