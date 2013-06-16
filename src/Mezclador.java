public class Mezclador {

	public int[] mezclar(int[] a, int[] b) {

		int[] c = new int[a.length + b.length];

		int i = 0;
		int j = 0;

		while (i < a.length && j < b.length) {

			if (a[i] < b[j]) {
				c[i + j] = a[i];
				i++;
			} else {
				c[i + j] = b[j];
				j++;
			}
		}

		if (i < a.length) {
			while (i < a.length) {
				c[i + j] = a[i];
				i++;
			}
		} else {
			while (j < b.length) {
				c[i + j] = b[j];
				j++;
			}
		}

		return c;

	}

}
