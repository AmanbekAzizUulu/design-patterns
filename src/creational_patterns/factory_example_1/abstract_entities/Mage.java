package creational_patterns.factory_example_1.abstract_entities;

import creational_patterns.factory_example_1.entities.enums.UnitColor;

public abstract class Mage {
	protected final UnitColor unitColor;

	protected Mage() {
		this.unitColor = initializeUnitColor();
	}

	protected abstract UnitColor initializeUnitColor();

}
