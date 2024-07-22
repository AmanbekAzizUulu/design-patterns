package creational_patterns.factory_example_1.entities.creator;

import creational_patterns.factory_example_1.abstract_entities.Creator;
import creational_patterns.factory_example_1.abstract_entities.Mage;
import creational_patterns.factory_example_1.entities.product.RedMage;

public class RedMageCreator extends Creator{

	@Override
	public Mage createMage() {
		return new RedMage();
	}

}
