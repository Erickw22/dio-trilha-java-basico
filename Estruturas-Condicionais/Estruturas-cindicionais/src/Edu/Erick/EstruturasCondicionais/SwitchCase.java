package Edu.Erick.EstruturasCondicionais;

public class SwitchCase {
    
    /*
     * A estrutura switch compara o valor de cada caso com o da variável sequencialmente, e sempre que encontra um valor correspondente,
     *  executa o código associado ao caso. Para evitar que as comparações continuem a ser executadas após um caso correspondente ter sido encontrado,
     *  acrescentamos,o comando break no final de cada bloco de códigos. O comando break, quando executado,
     *  encerra a execução da estrutura onde ele se encontra.
     */
// Modo condicional if/else

	/*public static void main(String[] args) {
		String sigla = "M";

		if(sigla == "P")
			System.out.println("PEQUENO");
		else if(sigla == "M")
			System.out.println("MEDIO");
		else if(sigla == "G")
			System.out.println("GRANDE");
		else
			System.out.println("INDEFINIDO");	
	} */

    // SistemaMedida.java

// Modo condicional switch / case
	public static void main(String[] args) {
		String sigla = "M";

		switch (sigla) {
		case "P":{
			System.out.println("PEQUENO");
			break;
		}
		case "M":{
			System.out.println("MEDIO");
			break;
		}
		case "G":{
			System.out.println("GRANDE");
			break;
		}
		default:
			System.out.println("INDEFINIDO");
		}
			
		
	}
}


