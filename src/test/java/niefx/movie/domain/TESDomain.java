package niefx.movie.domain;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
/**
 * 
 * @ClassName: TESDomain 
 * @Description: 实体类
 * @author: X
 * @date: 2020年4月27日 上午11:20:21
 */
public class TESDomain {
	private BigInteger id;
	private String name;
	private int age;
	private BigDecimal xinc;
	private Date created;
	public BigInteger getId() {
		return id;
	}
	public void setId(BigInteger id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public BigDecimal getXinc() {
		return xinc;
	}
	public void setXinc(BigDecimal xinc) {
		this.xinc = xinc;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	@Override
	public String toString() {
		return "编号=" + id + ", 姓名=" + name + ", 年龄=" + age + ", 薪资=" + xinc + ", 聘用日期=" + created;
	}
	public TESDomain(BigInteger id, String name, int age, BigDecimal xinc, Date created) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.xinc = xinc;
		this.created = created;
	}
	public TESDomain() {
		super();
	}

	
	
	
}
