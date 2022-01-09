
public class Catch {

	public static void initCatch(PokeBall pokeball, Pokemon pokemon) {
		if (pokeball.getCatchRate() >= pokemon.getCatchRate()) {
			System.out.println("¡Enhorabuena, has atrapado un " + pokemon.getName() + "!");
		} else {
			System.out.println("¡Mala suerte, " + pokemon.getName() + " ha escapado!");
		}
	}
}
