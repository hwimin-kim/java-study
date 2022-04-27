package prob03;

public class CurrencyConverter {
	   private static double rate;

	   public static double  toDollar(double won) {
	      return won*(1/rate);
	   }
	   public static double  toKRW(double dollar) {
	      return dollar*rate;
	   }
	   public static void setRate(double rate) {
		   CurrencyConverter.rate = rate;
	   }
}
