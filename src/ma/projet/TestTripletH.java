package ma.projet;

public class TestTripletH {
	public static void main(String[] args) {

		System.out.println("Test [1] : Triplet Hétérogène Simple");
		TripletH<Integer, String, Double> produit = new TripletH<>(101, "Clavier", 450.50);

		// Affichage avec toString()
		System.out.println(produit);

		System.out.println("\n Test [2] : Triplet Hétérogène Complexe");
		// Exemple avec un booléen (comme dans l'énoncé mais avec d'autres valeurs)
		TripletH<String, Integer, Boolean> etudiant = new TripletH<>("Preston ", 22, true);

		System.out.println("Fiche étudiant : " + etudiant);

		// Utilisation d'un getter spécifique
		System.out.println("Le nom de l'étudiant est : " + etudiant.getVal1());
	}
}