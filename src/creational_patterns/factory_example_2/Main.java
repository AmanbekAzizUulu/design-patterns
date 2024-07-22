package creational_patterns.factory_example_2;


import creational_patterns.factory_example_2.abstract_entities.Creator;
import creational_patterns.factory_example_2.entities.creator.JapaneseBlacksmith;
import creational_patterns.factory_example_2.entities.creator.NorwegianBlacksmith;

public class Main {
	private static Creator factory;
	public static void main(String[] args) {
			factory = new JapaneseBlacksmith();
			System.out.println(factory.createSword());

			factory = new NorwegianBlacksmith();
			System.out.println(factory.createSword());
	}
}
