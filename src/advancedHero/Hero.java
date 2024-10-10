package advancedHero;

public abstract class Hero {
	private String name;
	private int level;
	private double exp;
	protected DefendBehavior defendBehavior;
	protected MoveBehavior moveBehavior;
	public Hero() {
		this("David", 1, 0);
	}
	public Hero(String name, int level, double exp) {
		this.name = name;
		this.level = level;
		this.exp = exp;
	}
	public String getName() {
		return name;
	}
	public void performDefend() {
		if (defendBehavior == null) {
			return;
		}
		defendBehavior.defend(this);
	}
	public void performMove() {
		if (moveBehavior == null) {
			return;
		}
		moveBehavior.move(this);
	}
	public abstract void attack();
	
}
