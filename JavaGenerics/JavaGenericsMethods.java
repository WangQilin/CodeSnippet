package JavaGenerics;
public class JavaGenericsMethods {

	// generic method printArray
	public static <E> void printArray(E[] inputArray) {
		for (E element: inputArray) {
			System.out.printf("%s ", element);
		}
		System.out.println();
	}
	
	// determines the largest of three Comparable objects, Bounded Type Parameters
	public static <T extends Comparable<T>> T max(T x, T y, T z) {
		T max = x;
		if (y.compareTo(max) > 0)
			max = y;
		if (z.compareTo(max) > 0)
			max = z;
		return max;
	}
}