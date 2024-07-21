package abstract_factory_example_2.specific_implementation.red_units;

import abstract_factory_example_2.abstract_entities.Knight;
import abstract_factory_example_2.specific_implementation.enums.color.UnitColor;

public class RedKnight extends Knight {
	private final float redKnightKoef;
	private final UnitColor unitColor;

	public RedKnight(int health, float attackValue, float redKnightKoef) {
		super(health, attackValue);

		this.redKnightKoef = redKnightKoef;
		this.unitColor = UnitColor.RED;
	}

	@Override
	public void parry() {
		System.out.println("RedKnight is parrying with coefficient: " + redKnightKoef);
	}

	@Override
	public String toString() {
		return "Unit {\n" +
				"\ttype of unit = " + unitType + ",\n" +
				"\tcolor of unit  = " + unitColor + ",\n" +
				"\thealth points = " + health + ",\n" +
				"\tattack value = " + attackValue + ",\n" +
		"}";
	}
}
