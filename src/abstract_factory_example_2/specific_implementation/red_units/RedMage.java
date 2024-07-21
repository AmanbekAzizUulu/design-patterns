package abstract_factory_example_2.specific_implementation.red_units;

import abstract_factory_example_2.abstract_entities.Mage;
import abstract_factory_example_2.specific_implementation.enums.color.UnitColor;

public class RedMage extends Mage {
	private final float fireballRadius;
	private final float fireballDamage;

	private final UnitColor unitColor;

	public RedMage(int health, float attackValue, float manaPoint, float fireballRadius, float fireballDamage) {
		super(health, attackValue, manaPoint);

		this.fireballRadius = fireballRadius;
		this.fireballDamage = fireballDamage;
		this.unitColor = UnitColor.RED;

	}

	@Override
	public void castSpell() {
		System.out.println("Casting Fireball with radius: " + fireballRadius + " and damage: " + fireballDamage);
	}

	@Override
	public String toString() {
		return "Unit {\n" +
				"\ttype of unit = " + unitType + ",\n" +
				"\tcolor of unit  = " + unitColor + ",\n" +
				"\thealth points = " + health + ",\n" +
				"\tattack value = " + attackValue + ",\n" +
				"\tfireball damage = " + fireballDamage + ",\n" +
				"\tfireball radius = " + fireballRadius + ",\n" +
		"}";
	}

}
