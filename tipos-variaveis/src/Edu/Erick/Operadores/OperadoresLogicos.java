package Edu.Erick.Operadores;

public class OperadoresLogicos {
    public static void main(String[] args){
        //Os operadores lógicos representam o recurso que nos permite criar expressões lógicas maiores
        //a partir da junção de duas ou mais expressões.

        //&& Operador Lógico "E"
        //|| Operador Lógico "OU"

        boolean condicao1=true;

        boolean condicao2=false;

        /* Aqui estamos utilizando o operador lógico E para fazer a união de duas 
        expressões. 
        É como se estivesse escrito:
        "Se Condicao1 e Condicao2 forem verdadeiras, executar código"
        */

        if(condicao1 && condicao2)
	        System.out.print("Os dois valores precisam ser verdadeiros");;
        
        //Se condicao1 OU condicao2 for verdadeiro, executar código.
        if(condicao1 || condicao2)
	        System.out.print("Um dos valores precisa ser verdadeiro");


        // ComparacaoAvancada.java
        int numero1 = 1;
        int numero2 = 1;

            if(numero1== 2 & numero2 ++ == 2 )
                System.out.println("As 2 condições são verdadeiras");

                System.out.println("O numero 1 agora é " + numero1);
                System.out.println("O numero 2 agora é " + numero2);
    }
}
