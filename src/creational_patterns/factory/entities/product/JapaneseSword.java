package creational_patterns.factory.entities.product;

import creational_patterns.factory.abstract_entities.Sword;
import creational_patterns.factory.entities.enums.SwordType;

public class JapaneseSword extends Sword{

	@Override
	protected SwordType initializeSwordType() {
		return SwordType.JAPANESE_SWORD;
	}

	@Override
	public String toString() {
		return "Sword {\n" +
			   "\ttype of sword = " + this.swordType +
		"\n}";
	}
}
