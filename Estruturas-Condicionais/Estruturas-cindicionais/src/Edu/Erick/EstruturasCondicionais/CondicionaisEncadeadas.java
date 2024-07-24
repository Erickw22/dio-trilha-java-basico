package Edu.Erick.EstruturasCondicionais;

public class CondicionaisEncadeadas {
    /*
     * Em um controle de fluxo condicional, nem sempre nos 
     * limitamos ao se (if) e senão (else), poderemos ter uma terceira, quarta e ou inúmeras condições.
     */

     // ResultadoEscolar.java
    public static void main(String[] args) {
        int nota = 6;

	if (nota >= 7)
		System.out.println("Aprovado");
	else if (nota >= 5 && nota < 7)
		System.out.println("Recuperação");
	else
		System.out.println("Reprovado");
    }

}
