package creational_patterns.abstract_factory_example_2.specific_implementation.red_units;

import creational_patterns.abstract_factory_example_2.abstract_entities.Archer;
import creational_patterns.abstract_factory_example_2.specific_implementation.enums.color.UnitColor;

public class RedArcher extends Archer {
	private final float fireArrowDamage;
	private final UnitColor unitColor;

	public RedArcher(int health, float attackValue, float rangeDistance, float fireArrowDamage) {
		super(health, attackValue, rangeDistance);

		this.fireArrowDamage = fireArrowDamage;
		this.unitColor = UnitColor.RED;
	}

	@Override
	public void shoot() {
		System.out.println("Shooting fire arrow with damage: " + fireArrowDamage + " at distance: " + rangeDistance);
	}

	@Override
	public String toString() {
		return "Unit {\n" +
				"\ttype of unit = " + unitType + ",\n" +
				"\tcolor of unit = " + unitColor + ",\n" +
				"\thealth points = " + health + ",\n" +
				"\tattack value = " + attackValue + ",\n" +
				"\trange distance = " + rangeDistance + "\n" +
		"}";
	}
}
