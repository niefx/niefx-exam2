package niefx.movie.domain;

import static org.junit.Assert.*;

import java.io.UnsupportedEncodingException;

import org.junit.Test;

public class StringUtilTest {

	@Test
	public void testGetZHString(){
		String str = StringUtil.getZHString(2);
		System.out.println(str);
	}

	@Test
	public void testGetZHName() {
		String zhName = StringUtil.getZHName();
		System.out.println(zhName);
	}

}
