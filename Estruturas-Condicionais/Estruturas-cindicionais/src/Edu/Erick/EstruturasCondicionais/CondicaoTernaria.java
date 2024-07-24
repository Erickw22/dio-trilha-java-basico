package Edu.Erick.EstruturasCondicionais;

public class CondicaoTernaria {
    /*
     * Como vimos em operadores, podemos abreviar nosso algorítmico condicional refatorando
     *  com o conceito de operador ternário. Vamos refatorar os exemplos acima para ilustrar o poder deste recurso:
     */

     // Cenário 1
	public static void main(String[] args) {
		int nota = 7;
		String resultado = nota >=7 ? "Aprovado" : "Reprovado";
		System.out.println(resultado);
	}

    // Cenário 2

	/*public static void main(String[] args) {
		int nota = 6;
		String resultado = nota >=7 ? "Aprovado" : nota >=5 && nota <7 ? "Recuperação" : "Reprovado";
		System.out.println(resultado);
	}*/
}




