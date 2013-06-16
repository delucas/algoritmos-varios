public class OrdenadorPorBurbujeo extends Ordenador {

	public void ordenar(int[] arreglo) {
		
		for (int cantidadDeRepeticiones = arreglo.length; cantidadDeRepeticiones > 0; cantidadDeRepeticiones--) {
			for (int i = 0; i < cantidadDeRepeticiones - 1; i++) {
				if (arreglo[i] > arreglo[i + 1]) {
					intercambiar(arreglo, i, i + 1);
				}
			}

		}
	}

}
