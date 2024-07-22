package creational_patterns.abstract_factory_example_2.specific_implementation.blue_units;

import creational_patterns.abstract_factory_example_2.abstract_entities.Archer;
/**
 * 	Not implemented yet
 *
 */
public class BlueArcher extends Archer{

	public BlueArcher(int health, float attackValue, float rangeDistance) {
		super(health, attackValue, rangeDistance);
		//TODO Auto-generated constructor stub
	}

	@Override
	public void shoot() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'shoot'");
	}

}
