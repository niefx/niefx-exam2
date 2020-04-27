package niefx.movie.domain;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashSet;
import java.util.Random;


/**
 * 
 * @ClassName: RandomUtil 
 * @Description: 随机数工具类
 * @author: X
 * @date: 2020年4月23日 下午5:37:50
 */
public class RandomUtil {
		
	
	private static final RoundingMode ROUND_HALF_DOWN = null;
	//方法1：获得指定范围的随机小数,精度scale表示小数点后位数，举例min为25400.56,max为67078.94,返回小数点后2位的min和max之间的数，比如48545.87（8分）
	public static double getValue(final double min, final double max,final int scale){
		
		String mi = min+"";
		String ma = max+"";
		//截取小数点之前的值
		String m = mi.substring(0, mi.indexOf("."));
		String a = ma.substring(0, ma.indexOf("."));
		
		int random = random(Integer.parseInt(m),Integer.parseInt(a));
		
		//截取小数点之后的值
		String m1 = mi.substring(mi.indexOf(".")+1,mi.length());
		String a1 = ma.substring(ma.indexOf(".")+1,ma.length());
		
		int random2 = random(Integer.parseInt(m1),Integer.parseInt(a1));
		//加上随即的结果
		String ran = random+"."+random2;
		double dd = Double.parseDouble(ran);
		return dd;
	}
	
	
	//方法2：返回min-max之间的随机整数（包含min和不包含max值），例如返回1-3之间的随机数，则返回1或2，不能是其他数值（8分）
	public static int random(int min, int max){
		Random r = new Random();
		int n1 = (r.nextInt(max-min)+min);
		
		return n1;
	} 
	
	
	
	
	
	
	
	
	
	

	//方法3：返回1个1-9,a-Z之间的随机字符。 (8分)
	public static char randomCharacter (){
		String str = "123456789qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
		
		
		return str.charAt(random(0, str.length()-1));
	}
	//方法4：返回参数length个字符串(5分)，方法内部要调用randomCharacter()方法 (4分)
	public static String randomString(int length){
		
		StringBuffer str = new StringBuffer();
		for(int i=0;i<length;i++) {
			str.append(randomCharacter());
		}
		return str.toString();
	}
	
}
