package creational_patterns.factory_example_2.entities.creator;

import creational_patterns.factory_example_2.abstract_entities.Creator;
import creational_patterns.factory_example_2.abstract_entities.Sword;
import creational_patterns.factory_example_2.entities.product.NorwegianSword;

public class NorwegianBlacksmith implements Creator{

	@Override
	public Sword createSword() {
		return new NorwegianSword();
	}
}
