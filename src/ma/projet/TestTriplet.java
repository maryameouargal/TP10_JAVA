package ma.projet;

public class TestTriplet {
	public static void main(String[] args) {

		System.out.println(" Test [1] : Triplet d'Entiers");
		Triplet<Integer> tripletNotes = new Triplet<>(15, 18, 12);
		System.out.println("Notes initiales : " + tripletNotes);

		// 2. Test de la méthode swap
		tripletNotes.swap();
		System.out.println("Après le swap   : " + tripletNotes);

		// 3. Utilisation d'un getter
		System.out.println("La note du milieu est : " + tripletNotes.getElementB());

		System.out.println("\n Test [2 ]: Triplet de Chaînes de caractères ");
		Triplet<String> tripletNoms = new Triplet<>("Rina", "Marcus ", "Preston");
		System.out.println(" les Prénoms : " + tripletNoms);

	}
}
