package abstract_factory_example_2.abstract_entities;

import abstract_factory_example_2.specific_implementation.enums.unit_type.UnitType;

public abstract class Archer extends Unit{
	protected final float rangeDistance;

	protected final UnitType unitType = UnitType.ARCHER;

	public Archer(int health, float attackValue, float rangeDistance) {
		super(health, attackValue);
		
		this.rangeDistance = rangeDistance;
	}

	public abstract void shoot();


}
