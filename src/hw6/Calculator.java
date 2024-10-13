package hw6;

public class Calculator {
	private int x;
	private int y;
	public Calculator() {}
	public Calculator(int x, int y) throws CalException {
		setX(x);
		setY(y);
	}
	public int getX() {
		return x;
	}
	public void setX(int x) throws CalException {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) throws CalException {
		if (x == 0 && y == 0) {
			throw new CalException("x和y不能同時為0");
		} else if (y < 0) {
			throw new CalException("y不能為負值，結果將不為整數");
		}
		this.y = y;
	}
	public int getPower() {
		return (int) Math.pow(x, y);
	}
}
