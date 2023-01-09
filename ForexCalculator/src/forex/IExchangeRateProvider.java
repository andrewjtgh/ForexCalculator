package forex;

public interface IExchangeRateProvider {
	double getRate(String src, String dest);
}
