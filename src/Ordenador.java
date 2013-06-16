
public abstract class Ordenador {

	public abstract void ordenar(int[] arreglo);
	
	public void intercambiar(int[]arreglo, int posicionA, int posicionB) {
		int temporal = arreglo[posicionA];
		arreglo[posicionA] = arreglo[posicionB];
		arreglo[posicionB] = temporal;
	}

}
