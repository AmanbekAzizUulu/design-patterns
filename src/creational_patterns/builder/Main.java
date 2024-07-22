package creational_patterns.builder;

import creational_patterns.builder.entity.Truck;

public class Main {
	public static void main(String[] args) {
		Truck truck = Truck.builder()
				.setOwner("Amanbek Aziz uulu")
				.setStsNumber("123 AYUTA")
				.isHasTrailer(true)
				.setYear(2024).build();

		System.out.println(truck);
	}
}
