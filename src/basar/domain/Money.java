package basar.domain;

import java.math.BigDecimal;

public class Money {
	
	private final BigDecimal value;

	public Money(BigDecimal value){
		this.value = value;
	}

	public BigDecimal getValue() {
		return value;
	}

}
