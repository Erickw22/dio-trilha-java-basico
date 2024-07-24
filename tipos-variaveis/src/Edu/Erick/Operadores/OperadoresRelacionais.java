package Edu.Erick.Operadores;

public class OperadoresRelacionais {
    public static void main(String[] args){

    
//Os operadores relacionais avaliam a relação entre duas variáveis ou expressões. Neste caso,
//mais precisamente, definem se o operando à esquerda é igual, diferente, menor, menor ou igual, maior ou maior ou igual ao da direita,
//retornando um valor booleano como resultado.

    int numero1 = 1;
    int numero2 = 2;

    if(numero1 > numero2)
        System.out.print("Numero 1 maior que numero 2");

    if(numero1 < numero2)
        System.out.print("Numero 1 menor que numero 2");

    if(numero1 >= numero2)
        System.out.print("Numero 1 maior ou igual que numero 2");

    if(numero1 <= numero2)
        System.out.print("Numero 1 menor ou igual que numero 2");

    if(numero1 != numero2)
        System.out.print("Numero 1 é diferente de numero 2");


        // comparação Avancada.java
        String nome1 = "JAVA";
        String nome2 = "JAVA";
        
        System.out.println(nome1 == nome2); //true

        String nome3 = new String("JAVA");
        
        System.out.println(nome1 == nome3); //false

        String nome4 = nome3;

        System.out.println(nome3 == nome4); //true
        
        //equals na parada
        //equals coompara se conteudos de duas ou mais variaveis sao iguais
        System.out.println(nome1.equals(nome2)); //??
        System.out.println(nome2.equals(nome3)); //??
        System.out.println(nome3.equals(nome4)); //??

    }       

}
