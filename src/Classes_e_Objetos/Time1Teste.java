package Classes_e_Objetos;

public class Time1Teste {
    public static void main(String[] args) {

        //Cria o Objeto Time1 e o inicializa
        Time1 time = new Time1(); //Invoca o construtor implicito da classe Time1

        //Gera saída de representações de string da data/hora
        displayTime("Após criação do objeto time",time);
        System.out.println();

        //altera a data/hora e gera saída da data/hora atualizada
        time.setTime(15,32,6);
        displayTime("Após chamada do metodo setTime", time);
        System.out.println();

        //Tenta definir data/hora com valores inválidos
        try {
            time.setTime(99,99,99); // todos os valores fora do intervalo
        }catch (IllegalArgumentException e){
            System.out.println("Exception: " + e.getMessage());
        }

        displayTime("Após chamar o metodo setTime com valores inválidos", time);


    }
    private static void displayTime(String cabecalho, Time1 t){
        System.out.printf("%s%nRelógio Universal: %s%nRelógio padrão: %s%n", cabecalho, t.toUniversalString(),t);
    }
}
