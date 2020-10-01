package cap1.aulas;

public class TiposPrimitivos {
    public static void main(String[] args) {
        // Tipos Numericos Inteiros
        byte anosDeEmpresa = 12;
        short numeroVoos = 420;
        int numHoras = 50000;
        long id = 3823832833838L;

        // Tipos Numericos de Ponto Flutuante;
        float salarioMensal = 11929.76F;
        double vendasAcumuladas = 2_990_38383.90;


        // Tipo Booleano
        boolean estaDeFerias = false;

        // Tipo Char
        char statusFuncionario = 'A';

        int diasEmpresa =  anosDeEmpresa * 365;

        int numeroViagensIda = numeroVoos / 2;


        double salarioAnual = (salarioMensal * 12) + salarioMensal;


        System.out.println(statusFuncionario);
        System.out.println("Ferias ? " + estaDeFerias);
        System.out.println("Quantidade de Dias na Empresa: " + diasEmpresa);
        System.out.println(numHoras);
        System.out.println(numeroViagensIda);
        System.out.println("Rendimento Anual: " + salarioAnual);
        System.out.println(id);
        System.out.println(vendasAcumuladas);


    }
}
