public class Preguica extends Animal {
    private boolean sobeArvore;

    public Preguica(String nome, int idade, boolean sobeArvore, String som) {
        super(nome, idade, som);
        this.sobeArvore = sobeArvore;
    }

    public boolean getSobeArvore() {
        return sobeArvore;
    }

    public void setSobeArvore(boolean sobeArvore) {
        this.sobeArvore = sobeArvore;
    }
}