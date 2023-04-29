public class Visualizar {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("dog", 5, true, "auau");
        Cavalo cavalo = new Cavalo("cavalo", 10, false, "relincha");
        Preguica preguica = new Preguica("preguicinha", 2, true, "barulho de preguica");

        System.out.println("Nome do dog: " + cachorro.getNome());
        System.out.println("Idade do dog: " + cachorro.getIdade());
        System.out.println("Ele corre? " + cachorro.getCorrer());
        System.out.println("Som: " + cachorro.getSom());
        System.out.println("Nome do cavalo: " + cavalo.getNome());
        System.out.println("Idade do cavalo: " + cavalo.getIdade());
        System.out.println("Ele corre? " + cavalo.getCorrer());
        System.out.println("Som: " + cavalo.getSom());
        System.out.println("Nome da preguiça: " + preguica.getNome());
        System.out.println("Idade do cavalo: " + preguica.getIdade());
        System.out.println("Ela sobe em árvore? " + preguica.getSobeArvore());
        System.out.println("Som: " + preguica.getSom());

    }
}