package abstract_factory_example_2.specific_implementation.red_units;

import abstract_factory_example_2.abstract_entities.Archer;
import abstract_factory_example_2.abstract_entities.Knight;
import abstract_factory_example_2.abstract_entities.Mage;
import abstract_factory_example_2.abstract_entities.UnitFactory;

public class RedUnitFactory extends UnitFactory {

	@Override
	public Knight createKnight() {
		return new RedKnight(100, 15.0f, 1.2f);
	}

	@Override
	public Mage createMage() {
		return new RedMage(80, 10.0f, 500, 5.0f, 20.0f);
	}

	@Override
	public Archer createArcher() {
		return new RedArcher(70, 12.0f, 30.0f, 18.0f);
	}

}
