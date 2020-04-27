package niefx.movie.domain;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

public class DateUtilTest {

	@Test
	public void testGetDate() {
		Date date = DateUtil.getDate(new Date());
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String str = format.format(date);
		System.out.println(str);
	}

}
