package numbers;

public class NumGenerator {
	private int lowerBound;
	private int upperBound;
	private int gNumber;
	public NumGenerator() {
		this(0,50);
		generate();
	}
	public NumGenerator(int l, int u) {
		lowerBound = l;
		upperBound = u;
		generate();
	}
	private void generate() {
		double r = Math.random();
		gNumber =(int)(lowerBound + (upperBound - lowerBound+1)*r);
	}
	public int getGuessedNumber() {
		return gNumber;
	}
}
