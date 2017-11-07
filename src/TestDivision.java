public class TestDivision {
	public static void main(String[] args) {
		try {  
			int num1 = Integer.parseInt(args[0]);
			int num2 = Integer.parseInt(args[1]);
			
			System.out.println(dividir(num1,num2));
			
		} catch (ArrayIndexOutOfBoundsException e) { 
			System.out.println("Uso: TestDivision <Int> <Int>"); 
		} catch (NumberFormatException ee) { 
			System.out.println("Los argumentos deben ser enteros"); 
		} finally {
		  System.out.println("Se ejecuta el bloque finally"); 
	  }
		
		System.out.println("Llegamos al final del programa");
	}
	
	private static int dividir (int dividendo, int divisor){
		int resultado = 0;
		System.out.println("Empezamos a dividir");
		resultado = dividendo / divisor;
		System.out.println("Finalizamos la división");
		return resultado;
	}
}
