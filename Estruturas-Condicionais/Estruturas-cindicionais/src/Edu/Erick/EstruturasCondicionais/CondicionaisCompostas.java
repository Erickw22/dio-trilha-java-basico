package Edu.Erick.EstruturasCondicionais;

public class CondicionaisCompostas {
    /*
        Algumas vezes o nosso programa deverá seguir mais de uma jornada de execução condionado
        a uma regra de negócio, este cenário é demoninado Estrutura Condicional Composta. Vejamos o exemplo abaixo:
    */

    // ResultadoEscolar.java
    public static void main(String[] args) {

       int nota = 6;
       
       if(nota >= 7)
        System.out.println("Aprovado");

       else
        System.out.println("Reprovado");
    }
}

