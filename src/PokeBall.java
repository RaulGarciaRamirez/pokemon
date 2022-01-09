
public class PokeBall {
	private int catchRate;
	private String name;
	private static final int INITIAL_CATCH_RATE = 101;
	
	public PokeBall() {
		this.catchRate = (int) (Math.random() * PokeBall.INITIAL_CATCH_RATE);
		this.name = "Poké Ball";
	}
	
	public PokeBall(int catchRate, String name) {
		this.catchRate = catchRate;
		this.name = name;
	}

	public int getCatchRate() {
		return catchRate;
	}

	public String getName() {
		return name;
	}
	
	
}
