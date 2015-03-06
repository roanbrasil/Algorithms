package br.com.roanbrasil.algoritmos;

/**
 * 
 * Basic Data Structure to use any algorithms
 * 
 * @author roanbrasil
 * @version 1.0 
 * @param <E>
 * @since 2015-03-06 
 * 
 * 
 */
public class BasicDataStructure {

	/**
	 * Compare if the element 1 comes first or not from the element2
	 * 
	 * @param a
	 * @param arrayElement2
	 * @return
	 */
	public static boolean compareLess(final Comparable<String> arrayElement1,
			final Comparable<String> arrayElement2) {
		return  arrayElement1.compareTo(arrayElement2.toString()) < 0;
	}

	/**
	 * Exchange values of array from position to sort them
	 * 
	 * @param objectArray
	 * @param i
	 * @param j
	 */
	@SuppressWarnings("unused")
	private static void exchangeValuesFromPosition(
			final Comparable<String>[] objectArray, final int i, final int j) {
		Comparable<String> t = objectArray[i];
		objectArray[i] = objectArray[j];
		objectArray[j] = t;
	}

	/**
	 * Print array elements
	 * 
	 * @param a
	 */
	@SuppressWarnings("unused")
	private static void printArrayElements(final Comparable<String>[] a) {
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
		System.out.println();
	}

	/**
	 * Test whether the array entries are in order
	 * @param a
	 * @return
	 */
	public boolean isSorted(final Comparable<String>[] a) { 
		for (int i = 1; i < a.length; i++)
			if (compareLess(a[i], a[i - 1]))
				return false;
		return true;
	}
}
