
public class Pokemon {
	private int health, strength, speed, catchRate;
	private String name;
	
	private static final int INITIAL_HEALTH = 301;
	private static final int INITIAL_STRENGTH = 51;
	private static final int INITIAL_SPEED = 201;
	private static final int INITIAL_CATCH_RATE = 101;
	
	public Pokemon() {
		this.health = (int) (Math.random() * Pokemon.INITIAL_HEALTH);
		this.strength = (int) (Math.random() * Pokemon.INITIAL_STRENGTH);
		this.speed = (int) (Math.random() * Pokemon.INITIAL_SPEED);
		this.catchRate = (int) (Math.random() * Pokemon.INITIAL_CATCH_RATE);
		this.name = "";
	}

	public Pokemon(int health, int strenght, int speed, String name) {
		this.health = health;
		this.strength = strenght;
		this.speed = speed;
		this.name = name;
	}
	
	public Pokemon(int health, int strenght, int speed, int catchRate, String name) {
		this.health = health;
		this.strength = strenght;
		this.speed = speed;
		this.catchRate = catchRate;
		this.name = name;
	}

	public int getHealth() {
		return health;
	}

	public int getStrength() {
		return strength;
	}

	public int getSpeed() {
		return speed;
	}

	public String getName() {
		return name;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCatchRate() {
		return catchRate;
	}
}
