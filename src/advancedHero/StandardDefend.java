package advancedHero;

public class StandardDefend implements DefendBehavior {

	@Override
	public void defend(Hero hero) {
		// TODO Auto-generated method stub
		System.out.println(hero.getName() + "做防禦動作");
	}
}
