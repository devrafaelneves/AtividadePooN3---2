public class Cachorro extends Animal {
    private boolean correr;

    public Cachorro(String nome, int idade, boolean correr, String som) {
        super(nome, idade, som);
        this.correr = correr;
    }

    public boolean getCorrer() {
        return correr;
    }

    public void setCorrer(boolean correr) {
        this.correr = correr;
    }
}