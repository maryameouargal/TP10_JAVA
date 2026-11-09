package ma.projet;

public class Triplet<T> {
	private T elementA;
	private T elementB;
	private T elementC;

	// Constructeur utilisant source
	public Triplet(T elementA, T elementB, T elementC) {
		this.elementA = elementA;
		this.elementB = elementB;
		this.elementC = elementC;
	}

	// Accesseurs Getters utilisant source

	public T getElementA() {
		return elementA;
	}

	public T getElementB() {
		return elementB;
	}

	public T getElementC() {
		return elementC;
	}

	// Affiche le contenu du triplet au lieu de methode affiche on peut utiliser
	// toString .
	@Override
	public String toString() {
		return "Triplet [elementA=" + elementA + ", elementB=" + elementB + ", elementC=" + elementC + "]";
	}
	
	// Méthode pour échanger A et B
	public void swap() {
		T temp = this.elementA;
		this.elementA = this.elementB;
		this.elementB = temp;
	}

}