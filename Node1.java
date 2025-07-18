package week2;

/**
 * This class has a Generic class type variable and a reference type variable.

 */
public class Node1<G> {
	protected Node1<G> next;
	protected G data;

	/**
	 * constructor to initialize the class variables during object creation.
	 * 
	 * @param class type data is passed as a parameter to the constructor.
	 */

	public Node1(G data) {
		this.data = data;
		this.next = null;
	}

	public G getData() {
		return data;
	}

}