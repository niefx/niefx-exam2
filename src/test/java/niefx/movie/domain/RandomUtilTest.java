package niefx.movie.domain;

import static org.junit.Assert.*;

import org.junit.Test;

public class RandomUtilTest {

	@Test
	public void testGetValue() {
		double value = RandomUtil.getValue(100.23, 150.63, 2);
		System.out.println(value);
	}

	@Test
	public void testRandom() {
		int random = RandomUtil.random(1, 3);
		System.out.println(random);
	}

}
