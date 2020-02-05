package model;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

//import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class StockDetails {
	
	String name;
	double price;
	double share;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getShare() {
		return share;
	}
	public void setShare(double share) {
		this.share = share;
	}
	@Override
	public String toString() {
		return "StockDetails[name=" +name+ ",price="+price+",share="+share+"]";
	}
	
	
}
