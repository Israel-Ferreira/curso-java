package cap1.aulas;

public class Inferencia {
    public static void main(String[] args){
        /*
        * No Java, quando declaramos uma variável com var,
        * O compilador infere o tipo da variável, se é uma String ou uma lista por exemplo
        * Depois da atribuição, a váriavel só aceita reatribuição com valores do tipo inferido
        *  anteriormente*/
        var b = 4.5;
        System.out.println(b);
    }
}
