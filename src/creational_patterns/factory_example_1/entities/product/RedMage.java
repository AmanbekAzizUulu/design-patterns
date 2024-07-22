package creational_patterns.factory_example_1.entities.product;

import creational_patterns.factory_example_1.abstract_entities.Mage;
import creational_patterns.factory_example_1.entities.enums.UnitColor;

public class RedMage extends Mage {

	@Override
	protected UnitColor initializeUnitColor() {
		return UnitColor.RED;
	}

	@Override
	public String toString() {
		return "Sword {\n" +
				"\tcolor of unit = " + this.unitColor +
		"\n}";
	}

}
