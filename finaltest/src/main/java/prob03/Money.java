package prob03;

import java.util.Objects;

public class Money {
	private int amount;
		
	public Money(int amount) {
		this.amount = amount;
	}
	
	public int getAmount() {
		return amount;
	}

	/* 코드 작성 */
	public Money add(Money data) {
		int result = this.amount + data.getAmount();
		return new Money(result);
	}
	
	public Money minus(Money data) {
		int result = this.amount - data.getAmount();
		return new Money(result);
	}
	
	public Money multiply(Money data) {
		int result = this.amount * data.getAmount();
		return new Money(result);
	}
	
	public Money devide(Money data) {
		int result = this.amount / data.getAmount();
		return new Money(result);
	}

	@Override
	public int hashCode() {
		return Objects.hash(amount);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Money other = (Money) obj;
		return amount == other.amount;
	}
	
	
	
}
