package lopreiato.it;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        
        Cavallo cavallo1 = new Cavallo("Cavallo 1");
        Cavallo cavallo2 = new Cavallo("Cavallo 2");
        Cavallo cavallo3 = new Cavallo("Cavallo 3");
        Cavallo cavallo4 = new Cavallo("Cavallo 4");
        Cavallo cavallo5 = new Cavallo("Cavallo 5");

        //thread
        cavallo1.start();
        cavallo2.start();
        cavallo3.start();
        cavallo4.start();
        cavallo5.start();

        cavallo1.join();
        cavallo2.join();
        cavallo3.join();
        cavallo4.join();
        cavallo5.join();

        Cavallo[] cavalli = {cavallo1, cavallo2, cavallo3, cavallo4, cavallo5};

        System.out.println("Classifica:");

        for (int i = 1; i <= cavalli.length; i++) {
            for (Cavallo cavallo : cavalli) {
                if (cavallo.getPosizione() == i) {
                    System.out.println(i + "° posto: " + cavallo.getNome());
                }
            }
        }
    }
}