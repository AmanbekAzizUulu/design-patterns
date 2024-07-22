package creational_patterns.factory_example_1;

import creational_patterns.factory_example_1.abstract_entities.Creator;
import creational_patterns.factory_example_1.entities.creator.BlueMageCreator;
import creational_patterns.factory_example_1.entities.creator.RedMageCreator;

public class Main {
	public static void main(String[] args) {
		Creator factory = new RedMageCreator();
		System.out.println(factory.createMage());

		factory = new BlueMageCreator();
		System.out.println(factory.createMage());
	}
}
