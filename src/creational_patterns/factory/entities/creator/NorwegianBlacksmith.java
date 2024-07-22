package creational_patterns.factory.entities.creator;

import creational_patterns.factory.abstract_entities.Creator;
import creational_patterns.factory.abstract_entities.Sword;
import creational_patterns.factory.entities.product.NorwegianSword;

public class NorwegianBlacksmith implements Creator{

	@Override
	public Sword createSword() {
		return new NorwegianSword();
	}
}
