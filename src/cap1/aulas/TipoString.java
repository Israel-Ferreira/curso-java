package cap1.aulas;

public class TipoString {
    public static void main(String[] args) {
        String greetings = "Lambda, Lambda, Lambda";

        String greetingsWithName =  greetings.concat(" NERDS");

        System.out.println(greetingsWithName);
        System.out.println(greetingsWithName.startsWith("Lambda"));
        System.out.println(greetingsWithName.endsWith("NERDS"));

        String greetingsWithLc =  greetings.toLowerCase();

        if(greetingsWithLc.equalsIgnoreCase(greetings)){
            System.out.println("Yes, it's equal ignoring case");
        }


        String nome = "Israel";
        String sobrenome = "Souza";

        double salario = 2100.00;

        int idade = 21;

        System.out.printf("Nome: %s %s \n idade: %s \n salário: %s", nome, sobrenome,idade,salario);



    }
}
