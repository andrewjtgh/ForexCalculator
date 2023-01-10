package forex;

import forex.ForexCalculator;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class TestForexCalculator {
	@Test
	public void testForexCalculator() {
		FakeRateProvider erp = new FakeRateProvider();
		ForexCalculator f = new ForexCalculator(erp);
		double expected = 140;
		double delta = 0.001;
		assertEquals(expected, f.calc("SGD", 100, "USD"), delta);
	}
}