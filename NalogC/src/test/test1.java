package test;

import static org.junit.Assert.*;
import NalogC.Nalog;

public class test1 {

	@org.junit.Test
	public void testPlus() {
		Nalog mc = new Nalog();
		double d_sum_n = mc.Nalog(100, "+", 10);
		assertEquals(Double.toString(10), Double.toString(d_sum_n));
	}
}
