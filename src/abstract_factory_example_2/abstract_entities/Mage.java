package abstract_factory_example_2.abstract_entities;

import abstract_factory_example_2.specific_implementation.enums.unit_type.UnitType;

public abstract class Mage extends Unit {
	protected final float manaPoint;

	protected final UnitType unitType = UnitType.MAGE;

	public Mage(int health, float attackValue, float manaPoint) {
		super(health, attackValue);

		this.manaPoint = manaPoint;
	}

	public abstract void castSpell();

}
