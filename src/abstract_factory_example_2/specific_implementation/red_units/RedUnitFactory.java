package abstract_factory_example_2.specific_implementation.red_units;

import abstract_factory_example_2.abstract_entities.Archer;
import abstract_factory_example_2.abstract_entities.Knight;
import abstract_factory_example_2.abstract_entities.Mage;
import abstract_factory_example_2.abstract_entities.UnitFactory;

/**
 * 			The {@code RedUnitFactory} class is a concrete implementation of the
 * 			{@code UnitFactory} abstract class.
 *			It provides the specific logic for creating different types of red-colored
 * 			units, such as knights, mages,
 * 			and archers. Each method in this class creates and returns an instance of a
 * 			corresponding red unit with
 * 			predefined attributes.
 * <p>
 * 			This factory follows the Factory Method design pattern, where each unit type
 * 			is instantiated by calling
 * 			a factory method, thereby encapsulating the instantiation logic for red
 * 			units.
 * </p>
 *
 * <p>
 * 			Example Usage:
 * </p>
 *
 * <pre>
 * 			RedUnitFactory factory = new RedUnitFactory();
 * 			Knight redKnight = factory.createKnight();
 * 			Mage redMage = factory.createMage();
 *			Archer redArcher = factory.createArcher();
 * </pre>
 *
 * @see UnitFactory
 * @see Knight
 * @see Mage
 * @see Archer
 */
public class RedUnitFactory extends UnitFactory {

	/**
	 * Creates a {@link Knight} with red-specific attributes.
	 *
	 * @return the specific {@link Knight} object, created with red-specific
	 *         attributes, based on the implementation
	 *         of this method.
	 */
	@Override
	public Knight createKnight() {
		// here, the logic for creating a red knight is implemented.
		return new RedKnight(100, 15.0f, 1.2f);
	}

	/**
	 * Creates a {@link Mage} with red-specific attributes.
	 *
	 * @return the specific {@link Mage} object, created with red-specific
	 *         attributes, based on the implementation
	 *         of this method.
	 */
	@Override
	public Mage createMage() {
		// here, the logic for creating a red mage is implemented.
		return new RedMage(80, 10.0f, 500, 5.0f, 20.0f);
	}

	/**
	 * Creates an {@link Archer} with red-specific attributes.
	 *
	 * @return the specific {@link Archer} object, created with red-specific
	 *         attributes, based on the implementation
	 *         of this method.
	 */
	@Override
	public Archer createArcher() {
		// here, the logic for creating a red archer is implemented.
		return new RedArcher(70, 12.0f, 30.0f, 18.0f);
	}

}
