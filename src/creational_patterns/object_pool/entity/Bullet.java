package creational_patterns.object_pool.entity;

public class Bullet {
	private  boolean active;

	public Bullet() {
		this.active = false;
	}

	public void shoot(){
		this.active = true;
		System.out.println("bullet fired");
	}

	public void reset(){
		this.active = false;
		System.out.println("bullet reset");
	}

	public boolean isActive(){
		return this.active;
	}
}
