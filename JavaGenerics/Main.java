package JavaGenerics;

public class Main {
	public static void main(String[] args) {
		// call the generic method printArray
		Integer[] intArr = {1, 2, 3, 4, 5};
		Double[] doubleArr = {1.1, 2.2, 3.3, 4.4, 5.5};
		Character[] charArr = {'a', 'b', 'c', 'd', 'e'};
		
		JavaGenericsMethods.printArray(intArr);
		JavaGenericsMethods.printArray(doubleArr);
		JavaGenericsMethods.printArray(charArr);
		System.out.println();
		
		// call the max method
		System.out.println("the max among 3, 4, 5 is: " + JavaGenericsMethods.max(3, 4, 5));
		System.out.println("the max among 3.3, 4.4, 5.5 is: " + JavaGenericsMethods.max(3.3, 4.4, 5.5));
		System.out.println("the max among a, b, c is: " + JavaGenericsMethods.max('a', 'b', 'c'));
		System.out.println();
		
		// test Java Generic class
		GenericClass<Integer> intBox = new GenericClass<Integer>(10);
		GenericClass<String> strBox = new GenericClass<String>("hello world");
		
		System.out.println(intBox.get());
		System.out.println(strBox.get());
		System.out.println();
		
	}
}
