package Classes_e_Objetos;

public class Time1 {

    private int hora;
    private int minuto;
    private int segundo;

    //Configura um novo valor de tempo usando hora universal; lança uma exceção
    // se a hora, minuto ou segundo forem inválidos
    public void setTime(int hora, int minuto, int segundo){

        // Valida hora, minuto e segundo
        if(hora < 0 || hora >= 24 || minuto < 0 || minuto >= 60 ||
        segundo <0 || segundo >=60){

            throw new IllegalArgumentException(
                    "hora, minuto e/ou segundo estão fora do intervalo permitido"
            );

        }
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }
    // converte em String no formato de data/hora universal (HH:MM:SS)
    public String toUniversalString(){
        return String.format("%02d:%02d:%02d", hora, minuto, segundo);
    }


    // converte em String no formato padrão de data/hora (H:MM:SS AM ou PM)
    @Override
    public String toString() {
        return String.format("%d:%02d:%02d %s",
                 ((hora == 0 || hora == 12) ? 12 : hora % 12), minuto, segundo, (hora < 12 ? "AM" : "PM"));
    }
}
