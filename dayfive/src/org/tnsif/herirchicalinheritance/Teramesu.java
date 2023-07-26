package org.tnsif.herirchicalinheritance;

public class Teramesu extends Android{
	
	//private data members
	private int version;
	
	//getter and setter
	public int getVersion() {
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
	}
	//parameterized constructor
	public Teramesu(String brand, String slotType, int version) {
		super(brand, slotType);
		this.version=version;
	}
	@Override
	public String toString() {
		return "Teramesu [version=" + version + ", toString()=" + super.toString() + "]";
	}
	
	

}
