package creational_patterns.abstract_factory_example_2.abstract_entities;

public abstract class UnitFactory {
	public abstract Knight createKnight();
	public abstract Archer createArcher();
	public abstract Mage createMage();

}
