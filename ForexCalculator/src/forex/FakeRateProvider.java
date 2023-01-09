package forex;

public class FakeRateProvider implements IExchangeRateProvider {
	@Override
	public double getRate(String src, String dest) {
		return 1.4;
	}
}