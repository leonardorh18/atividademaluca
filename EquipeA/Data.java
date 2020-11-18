public class Data{

    private int minutos;
    private int segundos;
    private int dia;
    private int hora;
    private int mes;
    private int ano;

    public void showData(){
        System.out.println(this.dia +"/"+ this.mes + "/" + this.ano + " Hora " + this.hora + ":"+ this.minutos + ":"+ this.segundos);
    }
    public int getMinutos() {
        return this.minuto;
    }

    public void setMinutos(int minuto) {
        if (minuto < 60){

            this.minuto = minuto;
        } else {
            this.minuto = 0;
        }
        
    }

    public int getSegundos() {
        return this.segundos;
    }

    public void setSegundos(int segundos) {
        if (minuto < 60){

            this.segundos = segundos;
        } else {
            this.segundos = 0;
        }
    }

    public int getDia() {
        return this.dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
        if (dia < 30){

            this.dia = dia;
        } else {
            this.dia = 0;
        }
    }

    public int getHora() {
        return this.hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMes() {
        return this.mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return this.ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }


}