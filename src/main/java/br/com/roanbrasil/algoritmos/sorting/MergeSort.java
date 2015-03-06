package br.com.roanbrasil.algoritmos.sorting;

import br.com.roanbrasil.algoritmos.BasicDataStructure;

/**
 * Merge Sort Algorithms
 * 
 * @author roanbrasil
 * @version 1.0
 * @param <E>
 * @since 2015-03-05
 * 
 */
public class MergeSort extends BasicDataStructure {

	@SuppressWarnings("unchecked")
	public static void sort(Comparable<String>[] arrayMainElement) {
		Comparable<String>[] auxArrayElement = new Comparable[arrayMainElement.length];
		sort(arrayMainElement, auxArrayElement, 0, arrayMainElement.length - 1);
	}

	/**
	 * Recursive method sort
	 * 
	 * @param arrayMainElement
	 * @param auxArrayElement
	 * @param lower
	 * @param hight
	 */
	private static void sort(Comparable<String>[] arrayMainElement,
			Comparable<String>[] auxArrayElement, int low, int high) {
		if (high <= low)
			return;
		int middle = low + (high - low) / 2;
		sort(arrayMainElement, auxArrayElement, low, middle);
		sort(arrayMainElement, auxArrayElement, middle + 1, high);
		merge(arrayMainElement, auxArrayElement, low, middle, high);
	}

	/**
	 * Merge
	 * 
	 * @param arrayMainElement
	 * @param auxArrayElement
	 * @param lower
	 * @param middle
	 * @param high
	 */
	public static void merge(Comparable<String>[] arrayMainElement,
			Comparable<String>[] auxArrayElement, int low, int middle, int high) {
		int i = low;
		int j = middle + 1;
		for (int k = low; k <= high; k++) {
			auxArrayElement[k] = arrayMainElement[k];
		}
		for (int k = low; k <= high; k++) {
			 if (i > middle)
				arrayMainElement[k] = auxArrayElement[j++];
			else if (j > high)
				arrayMainElement[k] = auxArrayElement[i++];
			else if (BasicDataStructure.compareLess(auxArrayElement[j],
					auxArrayElement[i]))
				arrayMainElement[k] = auxArrayElement[j++];
			else
				arrayMainElement[k] = auxArrayElement[i++];
		}
		for (int z = 0; z <= arrayMainElement.length - 1; z++) {
			System.out.print(arrayMainElement[z] + " - ");
		}
		System.out.println();
	}
}
