public class Main{

    public static void main (String[] args){

       Data data = new Data();

       Data data2 = new Data();

       data.setSegundos(30);
       data.setMinutos(30);
       data.setHora(13);
       data.setDia(12);

       data2.setSegundos(30);
       data2.setMinutos(30);
       data2.setHora(14);
       data2.setDia(13);



       data.showData();
       //data.checarEvento(15, 11, 10, 2010);
       System.out.println(data.difSegundos(data2));
    }

}