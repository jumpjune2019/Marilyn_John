package trafficlight;

public enum Colors {

	GREEN(5000), YELLOW(2000), RED(3000);
	
	private int value;
	
	private Colors(final int value) {
		this.value = value;
	}
	public int getValue() {
		return value;
	}
		 	
};
