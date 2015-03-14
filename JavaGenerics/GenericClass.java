package JavaGenerics;

public class GenericClass<T> {
	private T t;
	
	// constructor
	public GenericClass(T t) {
		this.t = t;
	}
	
	public T get() {
		return this.t;
	}
}
