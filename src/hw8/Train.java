package hw8;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Train {
	private int number;
	private String type;
	private String start;
	private String dest;
	private double price;
	
	public Train(int number, String type, String start, String dest, double price) {
		this.number = number;
		this.type = type;
		this.start = start;
		this.dest = dest;
		this.price = price;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getStart() {
		return start;
	}

	public void setStart(String start) {
		this.start = start;
	}

	public String getDest() {
		return dest;
	}

	public void setDest(String dest) {
		this.dest = dest;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return java.util.Objects.hash(number, type, start, dest, price);
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (this == obj) return true;
		if (obj == null || !(obj instanceof Train)) return false;
		Train other = (Train) obj;
		return this.number == other.number &&
					this.type.equals(other.type) &&
					this.start.equals(other.start) &&
					this.dest.equals(other.dest) &&
					this.price == other.price;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Train{" +
					"number=" + number +
					", type=' " + type + '\'' +
					", start=' " + start + '\'' +
					", dest=' " + dest + '\'' +
					", price=" + price +
					'}';					
	}
	
	
}
