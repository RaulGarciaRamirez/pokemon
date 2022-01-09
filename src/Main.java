import java.util.Scanner;

public class Main {
	private static final int NUM_POKEMON = 5;
	private static Pokemon[] pokemon = new Pokemon[NUM_POKEMON];
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		int opcion;
		do {
			System.out.println("Elija la opci�n:");
			System.out.println("1. Utilizar los pok�mon del juego");
			System.out.println("2. Crear los pok�mon aleatoriamente");
			System.out.println("3. Salir");
			opcion = Main.scanner.nextInt();

			if (opcion == 1) {
				Main.initPokemon();
				Main.initCombat();
			} else if (opcion == 2) {
				Main.initPokemonRandomly();
				Main.initCombat();
			} else if (opcion == 3) {

			} else {
				System.out.println("Opci�n incorrecta");
			}

		} while (opcion != 3);
		
		System.out.println("Saliendo del programa...");
	}

	private static void initPokemon() {
		Pokemon charizard = new Pokemon(100, 50, 50, "charizard");
		pokemon[0] = charizard;
		Pokemon blastoise = new Pokemon(150, 25, 150, "blastoise");
		pokemon[1] = blastoise;
		Pokemon venusaur = new Pokemon(300, 10, 100, "venusaur");
		pokemon[2] = venusaur;
		Pokemon bulbasaur = new Pokemon(250, 20, 180, "bulbasaur");
		pokemon[3] = bulbasaur;
		Pokemon pikachu = new Pokemon(300, 40, 200, "pikachu");
		pokemon[4] = pikachu;
	}

	private static void initPokemonRandomly() {
		for (int i = 0; i < pokemon.length; i++) {
			pokemon[i] = new Pokemon();
			pokemon[i].setName("pokemon" + i);
		}
	}

	private static void showPokemon() {
		for (int i = 0; i < pokemon.length; i++) {
			System.out.println((i + 1) + ". " + pokemon[i].getName());
		}
	}

	private static void initCombat() {
		Main.showPokemon();

		System.out.println("Elija primer Pok�mon");
		Pokemon pokemon1 = pokemon[Main.scanner.nextInt() - 1];

		System.out.println("Elija segundo Pok�mon");
		Pokemon pokemon2 = pokemon[Main.scanner.nextInt() - 1];

		Battle.initBattle(pokemon1, pokemon2);
	}
}
