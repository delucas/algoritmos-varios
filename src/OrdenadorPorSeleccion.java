public class OrdenadorPorSeleccion extends Ordenador {

	public void ordenar(int[] arreglo) {

		for (int longitud = arreglo.length; longitud > 1; longitud--) {
			int posicionMaximo = 0;
			for (int j = 1; j < longitud; j++) {
				if (arreglo[j] > arreglo[posicionMaximo]) {
					posicionMaximo = j;
				}
			}
			intercambiar(arreglo, posicionMaximo, longitud - 1);
		}

	}

}
