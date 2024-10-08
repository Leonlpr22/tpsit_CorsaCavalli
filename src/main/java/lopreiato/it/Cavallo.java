package lopreiato.it;

class Cavallo extends Thread {
    private String nome;
    private int distanzaPercorsa = 0;
    private int posizione = 0;
    private static int posizioneCorrente = 1;

    public Cavallo(String nome) {
        this.nome = nome;
    }

    public void run() {
        // simulazione della corsa
        while (distanzaPercorsa < 1000) {
            distanzaPercorsa += (int) (Math.random() * 100);
        }
        // posizione di arrivo quando il cavallo termina la corsa
        posizione = posizioneCorrente++;
    }

    public String getNome() {
        return nome;
    }

    public int getPosizione() {
        return posizione;
    }
}