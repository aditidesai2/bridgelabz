package week2;


public class CommonElements {

	protected int length;

	/**
	 * it check the length of the stacks.
	 * 
	 * @return integer value.
	 */
	public int length() {
		return length;
	}

	/**
	 * it checks whether the stack is empty or not .
	 * 
	 * @return boolean value.
	 */
	public boolean isEmpty() {
		return length() == 0;
	}

}