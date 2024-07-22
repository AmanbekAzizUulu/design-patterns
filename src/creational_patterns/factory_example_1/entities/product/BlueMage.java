package creational_patterns.factory_example_1.entities.product;

import creational_patterns.factory_example_1.abstract_entities.Mage;
import creational_patterns.factory_example_1.entities.enums.UnitColor;

public class BlueMage extends Mage {

	@Override
	protected UnitColor initializeUnitColor() {
		return UnitColor.BLUE;
	}

	@Override
	public String toString() {
		return "Sword {\n" +
				"\tcolor of unit = " + this.unitColor +
		"\n}";
	}
}
