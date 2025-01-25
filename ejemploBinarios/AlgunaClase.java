package ejemploBinarios;
import java.io.Serializable;

public class AlgunaClase implements Serializable{//Debe de implementar esta clase porque si no se pone y se grabe informacion y se in
	//tente recuperar no se podrá, si manejamos herencia basta con que a la madre se le ponga Serializable

	
	private int numero;
	private char letra;
	private String cadena;
	
	public AlgunaClase()
	{
		numero = 0;
		letra = 'A';
		cadena = "Hola";
	}
	
	public AlgunaClase(int elNumero, char laLetra, String laCadena)
	{
		numero = elNumero;
		letra = laLetra;
		cadena = laCadena;
	}
	public String toString()
	{
		return "Número = " + numero +" Letra = " + letra + " Cadena = "+cadena;
	}
}