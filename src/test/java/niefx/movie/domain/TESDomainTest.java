package niefx.movie.domain;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class TESDomainTest {
	/**
	 * 
	 * @Title: test1 
	 * @Description: 测试类
	 * @return: void
	 */
	
	@Test
	public void test1() {
		
		for(int i=1;i<=100;i++) {
			TESDomain tps = new TESDomain();
			//配置参数的值
			tps.setId(BigInteger.valueOf(i));
			
			tps.setName(StringUtil.getZHName());

			tps.setXinc(BigDecimal.valueOf(RandomUtil.getValue(30000.23, 80000.45, 2)));
			
			Calendar cal = Calendar.getInstance();
			
			cal.setTime(new Date());
			
			Date time = cal.getTime();
			Date date = DateUtil.getDate(time);
			tps.setCreated(date);
			
			tps.setAge(RandomUtil.random(1, 100));
			//打印
			System.out.println(tps);
		}
		
	}
	
	
}
