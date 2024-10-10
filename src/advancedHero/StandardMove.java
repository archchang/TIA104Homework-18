package advancedHero;

public class StandardMove implements MoveBehavior {
	@Override
	public void move(Hero hero) {
		// TODO Auto-generated method stub
		System.out.println(hero.getName() + "跑步");
	}
}
