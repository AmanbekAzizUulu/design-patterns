package creational_patterns.object_pool.pool;

import java.util.Hashtable;
import java.util.Enumeration;

/**
 * The ObjectPool class provides a generic implementation of the Object Pool
 * design pattern.
 * It manages the creation, validation, expiration, and reuse of objects to
 * optimize resource usage.
 *
 * @param <T> The type of objects to be pooled.
 */
public abstract class ObjectPool<T> {
	private long expirationTime;
	private Hashtable<T, Long> locked, unlocked;

	/**
	 * Constructs an ObjectPool with a default expiration time of 30 seconds.
	 */
	public ObjectPool() {
		expirationTime = 30000; // 30 seconds
		locked = new Hashtable<T, Long>();
		unlocked = new Hashtable<T, Long>();
	}

	/**
	 * Creates a new instance of the pooled object.
	 *
	 * @return a new instance of the pooled object.
	 */
	protected abstract T create();

	/**
	 * Validates the pooled object to ensure it is still usable.
	 *
	 * @param o the object to validate.
	 * @return true if the object is valid; false otherwise.
	 */
	public abstract boolean validate(T o);

	/**
	 * Expires the pooled object, performing any necessary cleanup.
	 *
	 * @param o the object to expire.
	 */
	public abstract void expire(T o);

	/**
	 * Checks out an object from the pool. If an available object exists and is
	 * valid, it is returned.
	 * Otherwise, a new object is created, added to the locked pool, and returned.
	 *
	 * @return an object from the pool.
	 */
	public synchronized T checkOut() {
		long now = System.currentTimeMillis();
		T t;
		if (unlocked.size() > 0) {
			Enumeration<T> e = unlocked.keys();
			while (e.hasMoreElements()) {
				t = e.nextElement();
				if ((now - unlocked.get(t)) > expirationTime) {
					// object has expired
					unlocked.remove(t);
					expire(t);
					t = null;
				} else {
					if (validate(t)) {
						unlocked.remove(t);
						locked.put(t, now);
						return (t);
					} else {
						// object failed validation
						unlocked.remove(t);
						expire(t);
						t = null;
					}
				}
			}
		}
		// no objects available, create a new one
		t = create();
		locked.put(t, now);
		return (t);
	}

	public synchronized void checkIn(T t_object){
		locked.remove(t_object);
		unlocked.put(t_object, System.currentTimeMillis());
	}
}
