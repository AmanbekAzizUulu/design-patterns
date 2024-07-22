package creational_patterns.object_pool;

import creational_patterns.object_pool.entity.Bullet;
import creational_patterns.object_pool.pool.BulletPool;

public class Main {
	public static void main(String[] args) {
		// Create the BulletPool:
		BulletPool pool = new BulletPool();

		// Get a bullet from the pool:
		Bullet bullet1 = pool.checkOut();

		// Use the bullet:
		bullet1.shoot();

		// Return the bullet to the pool:
		pool.checkIn(bullet1);

		// Get another bullet from the pool:
		Bullet bullet2 = pool.checkOut();

		// Use the bullet:
		bullet2.shoot();

		// Return the bullet to the pool:
		pool.checkIn(bullet2);
	}
}
