package creational_patterns.abstract_factory_example_2.specific_implementation.blue_units;

import creational_patterns.abstract_factory_example_2.abstract_entities.Archer;
import creational_patterns.abstract_factory_example_2.abstract_entities.Knight;
import creational_patterns.abstract_factory_example_2.abstract_entities.Mage;
import creational_patterns.abstract_factory_example_2.abstract_entities.UnitFactory;
/**
 * 	Not implemented yet
 *
 */
public class BlueUnitFactory extends UnitFactory{

	@Override
	public Knight createKnight() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'createKnight'");
	}

	@Override
	public Archer createArcher() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'createArcher'");
	}

	@Override
	public Mage createMage() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'createMage'");
	}

}
