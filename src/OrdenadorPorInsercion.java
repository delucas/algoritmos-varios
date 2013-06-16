public class OrdenadorPorInsercion extends Ordenador {

	public void ordenar(int[] arreglo) {
		
		for (int i = 1; i < arreglo.length; i++) {
			int j = i;
			while(j > 0 && arreglo[j] < arreglo[j-1] ) {
				intercambiar(arreglo, j, j-1);
				j--;
			}
		}
	}

}
