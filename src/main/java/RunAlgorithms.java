import br.com.roanbrasil.algoritmos.sorting.MergeSort;


public class RunAlgorithms {
	public static void main(String[] args) {

		String[] a = { "S", "O", "R", "T", "E", "X", "A", "M", "P", "L", "E" };
		long t1 = System.currentTimeMillis();
		MergeSort.sort(a);
		long t2 = System.currentTimeMillis();
		System.out.println(t2 - t1);
	}
}
