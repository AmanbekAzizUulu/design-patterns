package abstract_factory_example_2.abstract_entities;

public abstract class Unit {
	protected final int health;
	protected final float attackValue;
	
	public Unit(int health, float attackValue) {
		this.health = health;
		this.attackValue = attackValue;
	}


}
