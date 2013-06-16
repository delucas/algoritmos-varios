import org.junit.Assert;
import org.junit.Test;

public class OrdenamientosTests {

	Ordenador[] ordenadores = {
			new OrdenadorPorSeleccion(),
			new OrdenadorPorBurbujeo(),
			new OrdenadorPorInsercion()
		};
	
	public boolean estaOrdenado(int[] arreglo) {
		boolean arregloOrdenado = true;
		for (int i = 0; arregloOrdenado && i < arreglo.length - 1; i++) {
			arregloOrdenado = arreglo[i] < arreglo[i+1];
		}
		return arregloOrdenado;
	}
	
	@Test
	public void testQueElEstaOrdenadoDiceQueAlgoOrdenadoLoEsta() {
		int[] arreglo = {1,2,3,4,5,6,7,8};
		Assert.assertTrue(estaOrdenado(arreglo));
	}
	
	@Test
	public void testQueElEstaOrdenadoDiceQueAlgoDesordenadoNoLoEsta() {
		int[] arreglo = {1,2,4,3,5,6,7,8};
		Assert.assertFalse(estaOrdenado(arreglo));
	}
	
	@Test
	public void casoOrdenado() {
		for (Ordenador ordenador : ordenadores) {
			int[] arreglo = {1,2,3,4,5,6,7,8};
			ordenador.ordenar(arreglo);
			Assert.assertTrue("el mejor caso está ordenado para " + Ordenador.class.getName(),
					estaOrdenado(arreglo));
		}
	}
	@Test
	public void casoInvertido() {
		for (Ordenador ordenador : ordenadores) {
			int[] arreglo = {8,7,6,5,4,3,2,1};
			ordenador.ordenar(arreglo);
			Assert.assertTrue("el peor caso está ordenado para " + Ordenador.class.getName(),
					estaOrdenado(arreglo));
		}
	}
	@Test
	public void casoAlAzar() {
		for (Ordenador ordenador : ordenadores) {
			int[] arreglo = {2,5,4,7,6,8,3,1};
			ordenador.ordenar(arreglo);
			Assert.assertTrue("el caso promedio está ordenado para " + Ordenador.class.getName(),
					estaOrdenado(arreglo));
		}
	}
}
