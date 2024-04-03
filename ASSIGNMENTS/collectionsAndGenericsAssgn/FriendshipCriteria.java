package collectionsAndGenericAssgn;

public class FriendshipCriteria<T extends Comparable<T>, S extends Comparable<S>>{
	private T name;
	private S variable;
	
	public FriendshipCriteria(T name, S variable) {
		super();
		this.name = name;
		this.variable = variable;
	}

	public T getName() {
		return name;
	}

	public S getVariable() {
		return variable;
	}

}