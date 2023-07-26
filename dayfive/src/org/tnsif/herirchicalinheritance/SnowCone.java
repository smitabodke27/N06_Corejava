package org.tnsif.herirchicalinheritance;

public class SnowCone extends Android {

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
		public SnowCone(String brand, String slotType, int version) {
			super(brand, slotType);
			this.version=version;

		}
		@Override
		public String toString() {
			return "SnowCone [version=" + version + ", toString()=" + super.toString() + "]";
		}
		
}
