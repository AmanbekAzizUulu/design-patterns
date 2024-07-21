package builder.entity;

/**
 * Represents a Truck entity with owner information, vehicle identification
 * number (STS number),
 * trailer availability, and year of manufacture.
 */
public class Truck {
	private final String owner;
	private final String stsNumber;
	private final boolean hasTrailer;
	private final int year;

	/**
	 * Constructs a new Truck object.
	 *
	 * @param owner      The owner of the truck.
	 * @param stsNumber  The vehicle identification number (STS number) of the
	 *                   truck.
	 * @param hasTrailer Indicates whether the truck has a trailer attached.
	 * @param year       The year of manufacture of the truck.
	 */
	private Truck(String owner, String stsNumber, boolean hasTrailer, int year) {
		this.owner = owner;
		this.stsNumber = stsNumber;
		this.hasTrailer = hasTrailer;
		this.year = year;
	}

	/**
	 * Returns a string representation of the Truck object.
	 *
	 * @return A string representation of the Truck object.
	 */
	@Override
	public String toString() {
		return "Truck {\n\towner = " + this.owner + "\n\tvehicle identification number = " + stsNumber
				+ "\n\tavailability of trailer = " + hasTrailer + "\n\tyear of manufacture = " + year + "\n}";
	}

	/**
	 * Returns a new instance of TruckBuilder to facilitate building a Truck object.
	 *
	 * @return A new instance of TruckBuilder.
	 */
	public static TruckBuilder builder() {
		return new TruckBuilder();
	}

	/**
	 * A builder class for constructing Truck objects with optional parameters.
	 */
	public static class TruckBuilder {
		private String owner;
		private String stsNumber;
		private boolean hasTrailer;
		private int year;

		/**
		 * Sets the owner of the truck.
		 *
		 * @param owner The owner of the truck.
		 * @return This TruckBuilder instance for method chaining.
		 */
		public TruckBuilder setOwner(String owner) {
			this.owner = owner;
			return this;
		}

		/**
		 * Sets the vehicle identification number (STS number) of the truck.
		 *
		 * @param stsNumber The STS number of the truck.
		 * @return This TruckBuilder instance for method chaining.
		 */
		public TruckBuilder setStsNumber(String stsNumber) {
			this.stsNumber = stsNumber;
			return this;
		}

		/**
		 * Sets whether the truck has a trailer attached.
		 *
		 * @param hasTrailer True if the truck has a trailer, false otherwise.
		 * @return This TruckBuilder instance for method chaining.
		 */
		public TruckBuilder isHasTrailer(boolean hasTrailer) {
			this.hasTrailer = hasTrailer;
			return this;
		}

		/**
		 * Sets the year of manufacture of the truck.
		 *
		 * @param year The year of manufacture.
		 * @return This TruckBuilder instance for method chaining.
		 */
		public TruckBuilder setYear(int year) {
			this.year = year;
			return this;
		}

		/**
		 * Constructs and returns a new Truck object with the set parameters.
		 *
		 * @return A new Truck object with the specified parameters.
		 */
		public Truck build() {
			return new Truck(owner, stsNumber, hasTrailer, year);
		}
	}
}
