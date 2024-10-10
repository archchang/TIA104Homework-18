package advancedHero;

public class ArrowMan extends Hero {
	public ArrowMan() {
		super();
		defendBehavior = new StandardDefend();
		moveBehavior = new StandardMove();
	}
	public ArrowMan(String name, int level, double exp) {
		super(name, level, exp);
		defendBehavior = new StandardDefend();
		moveBehavior = new StandardMove();
	}
	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println(getName() + "放𢎜箭");
	}
}
