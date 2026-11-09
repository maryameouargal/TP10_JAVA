package ma.projet;

public class TripletH<A, B, C> {
	private final A val1;
	private final B val2;
	private final C val3;

	// Constructeur utislisant source

	public TripletH(A val1, B val2, C val3) {
		super();
		this.val1 = val1;
		this.val2 = val2;
		this.val3 = val3;
	}

	// Accesseurs GETTERS

	public A getVal1() {
		return val1;
	}

	public B getVal2() {
		return val2;
	}

	public C getVal3() {
		return val3;
	}

	// au lieu de utilise void affiche en utilise la methode toString
	@Override
	public String toString() {
		return "TripletH (" + val1 + " | " + val2 + " | " + val3 + ")";
	}
}