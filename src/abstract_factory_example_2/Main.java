package abstract_factory_example_2;

import java.util.ArrayList;
import java.util.List;

import abstract_factory_example_2.abstract_entities.Archer;
import abstract_factory_example_2.abstract_entities.Knight;
import abstract_factory_example_2.abstract_entities.Mage;
import abstract_factory_example_2.abstract_entities.Unit;
import abstract_factory_example_2.abstract_entities.UnitFactory;
import abstract_factory_example_2.specific_implementation.red_units.RedUnitFactory;

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
