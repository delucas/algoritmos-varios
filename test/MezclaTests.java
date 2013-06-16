import org.junit.Assert;
import org.junit.Test;

public class MezclaTests {

	@Test
	public void queArreglosVaciosSeMezclan() {
		int[] a = {};
		int[] b = {};
		
		Mezclador mezclador = new Mezclador();		
		Assert.assertArrayEquals(new int[]{}, mezclador.mezclar(a, b));
		
	}
	
	@Test
	public void queUnArregloVacioSeMezclaResultandoEnElOtro() {
		int[] a = {1,2,3};
		int[] b = {};
		
		Mezclador mezclador = new Mezclador();		
		Assert.assertArrayEquals(new int[]{1,2,3}, mezclador.mezclar(a, b));
		
	}
	
	@Test
	public void queUnArregloSeMezclaResultandoEnElMismoSiOtroVacio() {
		int[] a = {};
		int[] b = {1,2,3};
		
		Mezclador mezclador = new Mezclador();		
		Assert.assertArrayEquals(new int[]{1,2,3}, mezclador.mezclar(a, b));
		
	}
	
	@Test
	public void queUnArregloSimpleSeMezclaConOtro() {
		int[] a = {1};
		int[] b = {2};
		
		Mezclador mezclador = new Mezclador();		
		Assert.assertArrayEquals(new int[]{1,2}, mezclador.mezclar(a, b));
		
	}
	
	@Test
	public void queUnArregloSeMezclaConOtro() {
		int[] a = {1,3,5,7};
		int[] b = {2,4,8,10};
		
		Mezclador mezclador = new Mezclador();		
		Assert.assertArrayEquals(new int[]{1,2,3,4,5,7,8,10}, mezclador.mezclar(a, b));
		
	}
	
}
