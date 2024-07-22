package creational_patterns.object_pool.pool;

import creational_patterns.object_pool.entity.Bullet;

public class BulletPool extends ObjectPool<Bullet>{

	@Override
	protected Bullet create() {
		return new Bullet();
	}

	@Override
	public boolean validate(Bullet o) {
		return !o.isActive();
	}

	@Override
	public void expire(Bullet o) {
		o.reset();
	}

}
