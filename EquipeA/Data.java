public class Data{

    private int segundos;
    private int minutos;
    private int hora;
    private int dia;
    //private int mes;
    //private int ano;
    

    public double difSegundos(Data data){
        
        int dia = this.dia - data.getDia();
        int minutos =  this.minutos - data.getMinutos();
        int hora = this.hora - data.getHora();
        int segundos = this.segundos - data.getSegundos();

        //deixando tudo em minutos
        double res = (dia * 1440) + (minutos) + (hora * 60) + (segundos/60);
        if (res < 0){
            res = res * -1;
        }
        
        return res;
    }
    
    public void checarEvento(int hora, int dia, int mes, int ano){
        System.out.println("Checa se o evento da hora: " + this.hora + ", dia: " + this.dia);

                if (this.dia >= dia){

                    if (this.hora >= hora){
                        
                        System.out.println("Evento nao passou");

                        return;
                        
                    }
                }

        System.out.println("Evento passou");
        
        } 
    
    public boolean checarPM(){
        if (this.hora >= 12){
            return true;
        } else {
            return false;
        }
    }

    public void showData(){
        
        System.out.print("Data atual: Dia: " + this.dia +" Horario " + this.hora + ":"+ this.minutos + ":"+ this.segundos);
        if (checarPM()){
            System.out.println(" PM");
        }else{
            System.out.println(" AM");
        }
        
    }
    
    public int getMinutos() {
        return this.minutos;
    }

    public void setMinutos(int minuto) {
        if (minuto < 60){

            this.minutos = minuto;
        } else {
            this.minutos = 0;
        }
        
    }

    public int getSegundos() {
        return this.segundos;
    }

    public void setSegundos(int segundos) {
        if (segundos < 60){

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
 /*
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

*/
}