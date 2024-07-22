package creational_patterns.abstract_factory_example_2.abstract_entities;

import creational_patterns.abstract_factory_example_2.specific_implementation.enums.unit_type.UnitType;

public abstract class Knight extends Unit {

	protected final UnitType unitType = UnitType.KNIGHT;

	public Knight(int health, float attackValue) {
		super(health, attackValue);
	}

	public abstract void parry();
}
