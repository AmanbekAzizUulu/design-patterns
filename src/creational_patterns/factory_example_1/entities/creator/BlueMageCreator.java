package creational_patterns.factory_example_1.entities.creator;

import creational_patterns.factory_example_1.abstract_entities.Creator;
import creational_patterns.factory_example_1.abstract_entities.Mage;
import creational_patterns.factory_example_1.entities.product.BlueMage;

public class BlueMageCreator extends Creator{

	@Override
	public Mage createMage() {
		return new BlueMage();
	}

}
