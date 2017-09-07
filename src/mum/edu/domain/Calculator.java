package mum.edu.domain;

import java.io.Serializable;

public class Calculator implements Serializable {
    private static final long serialVersionUID = 748392348L;
	private Integer add1;
	private Integer add2;
	private Integer multi1;
	private Integer multi2;	
	private Integer sum;
	private Integer product;
	
	
	public Integer getAdd1() {
		return add1;
	}
	public Integer getAdd2() {
		return add2;
	}
	public Integer getMulti1() {
		return multi1;
	}
	public Integer getMulti2() {
		return multi2;
	}
	public Integer getSum() {
		return sum;
	}
	public Integer getProduct() {
		return product;
	}
	public void setAdd1(Integer add1) {
		this.add1 = add1;
	}
	public void setAdd2(Integer add2) {
		this.add2 = add2;
	}
	public void setMulti1(Integer multi1) {
		this.multi1 = multi1;
	}
	public void setMulti2(Integer multi2) {
		this.multi2 = multi2;
	}
	public void setSum(Integer sum) {
		this.sum = sum;
	}
	public void setProduct(Integer product) {
		this.product = product;
	}
	
	public Integer multiply() {
		return multi1 * multi2;
	}
	
	@Override
	public String toString() {
		return "Calculator [add1=" + add1 + ", add2=" + add2 + ", multi1=" + multi1 + ", multi2=" + multi2 + ", sum="
				+ sum + ", product=" + product + "]";
	}
	
}
