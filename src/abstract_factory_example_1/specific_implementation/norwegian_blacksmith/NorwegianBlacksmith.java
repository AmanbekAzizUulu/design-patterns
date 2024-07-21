package abstract_factory_example_1.specific_implementation.norwegian_blacksmith;

import abstract_factory_example_1.abstract_entities.Armor;
import abstract_factory_example_1.abstract_entities.Blacksmith;
import abstract_factory_example_1.abstract_entities.Spear;
import abstract_factory_example_1.abstract_entities.Sword;

public class NorwegianBlacksmith extends Blacksmith{

	@Override
	public Spear createSpear() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'createSpear'");
	}

	@Override
	public Sword createSword() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'createSword'");
	}

	@Override
	public Armor createArmor() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'createArmor'");
	}

}
