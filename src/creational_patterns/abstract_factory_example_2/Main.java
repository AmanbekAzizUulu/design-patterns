package creational_patterns.abstract_factory_example_2;

import java.util.ArrayList;
import java.util.List;

import creational_patterns.abstract_factory_example_2.abstract_entities.Archer;
import creational_patterns.abstract_factory_example_2.abstract_entities.Knight;
import creational_patterns.abstract_factory_example_2.abstract_entities.Mage;
import creational_patterns.abstract_factory_example_2.abstract_entities.Unit;
import creational_patterns.abstract_factory_example_2.abstract_entities.UnitFactory;
import creational_patterns.abstract_factory_example_2.specific_implementation.red_units.RedUnitFactory;

public class Main {
	public static void main(String[] args) {
		UnitFactory factory = new RedUnitFactory();

		Knight redKnight = factory.createKnight();
		Archer redArcher = factory.createArcher();
		Mage redMage = factory.createMage();

		List<Unit> units = new ArrayList<Unit>();

		units.add(redKnight);
		units.add(redMage);
		units.add(redArcher);

		units.forEach(unit -> System.out.println(unit));
	}
}
