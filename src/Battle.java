
public class Battle {

	public static void initBattle(Pokemon pokemon1, Pokemon pokemon2) {
		do {
			if (pokemon1.getSpeed() > pokemon2.getSpeed()) {
				System.out.println(pokemon1.getName() + " comienza el ataque contra " + pokemon2.getName());

				pokemon2.setHealth(pokemon2.getHealth() - pokemon1.getStrength());
				System.out.println(Battle.damageMessage(pokemon1, pokemon2));

				pokemon1.setHealth(pokemon1.getHealth() - pokemon2.getStrength());
				System.out.println(Battle.damageMessage(pokemon2, pokemon1));
			} else {
				System.out.println(pokemon2.getName() + " comienza el ataque contra " + pokemon1.getName());

				pokemon1.setHealth(pokemon1.getHealth() - pokemon2.getStrength());
				System.out.println(Battle.damageMessage(pokemon2, pokemon1));

				pokemon2.setHealth(pokemon2.getHealth() - pokemon1.getStrength());
				System.out.println(Battle.damageMessage(pokemon1, pokemon2));
			}
		} while (pokemon1.getHealth() > 0 && pokemon2.getHealth() > 0);

		System.out.println("-----------------------");

		if (pokemon1.getHealth() <= 0) {
			System.out.println(pokemon1.getName() + " ha perdido el combate.");
		}
		if (pokemon2.getHealth() <= 0) {
			System.out.println(pokemon2.getName() + " ha perdido el combate.");
		}
	}

	private static String damageMessage(Pokemon pokemon1, Pokemon pokemon2) {
		return pokemon1.getName() + " daña " + pokemon1.getStrength() + " a " + pokemon2.getName() + " y a "
				+ pokemon2.getName() + " le queda " + pokemon2.getHealth() + " vida.";
	}

}
