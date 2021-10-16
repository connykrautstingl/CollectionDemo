public class KontoDemoApp {


    public static void main(String[] args) {

        int counter = 1;
        Konto max = new Konto("Max Mustermann");
        //max.setInhaber("Max Mustermann");

        Konto susi = new Konto("Susi Sorglos");
        Konto john = new Konto("John Doe");

        max.print();
        susi.print();
        john.print();


        max.aufbuchen(1000);
        max.print();

        max.abbuchen(800);
        max.print();

        max.abbuchen(300);
       max.print();


       susi.aufbuchen(100_000);
       susi.print();

    }

}
