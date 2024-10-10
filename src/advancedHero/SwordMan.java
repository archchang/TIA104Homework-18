package advancedHero;

public class SwordMan extends Hero {
	public SwordMan() {
		super();
		defendBehavior = new StandardDefend();
		moveBehavior = new StandardMove();
	}
	public SwordMan(String name, int level, double exp) {
		super(name, level, exp);
		defendBehavior = new StandardDefend();
		moveBehavior = new StandardMove();
	}
	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println(getName() + "揮劍");
	}
}
