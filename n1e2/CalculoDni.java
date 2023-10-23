package n1e2;

public class CalculoDni {
	
	private int numero;
	private char letra;
	
	public CalculoDni(int numero) {
		this.numero = numero;
		char[] dniArray = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
		letra = dniArray[numero % 23];

	}
			
		public char getLetra() {
			return letra;
		}
		
		public String getDni() {
			return ("" + numero + letra);
		}
		
}


