public class AnimalTeste {
    public static void main(String[] args) {
        Cachorro a = new Cachorro(0, null);
        System.out.printf("Nome do animal: %s, Numero de patas: %d\n", a.nome, a.numPatas);

        Gato b = new Gato(0, null);
        System.out.printf("Nome do animal: %s, Numero de patas: %d\n", b.nome, b.numPatas);

        Cobra c = new Cobra(0 , null, 0);
        System.out.printf("Nome do animal: %s, Numero de patas: %d, Media de ovos: %d\n", c.nome, c.numPatas, c.mediaOvos);

        Tartaruga d = new Tartaruga(0, null, 0);
        System.out.printf("Nome do animal: %s, Numero de patas: %d, Media de ovos: %d\n", d.nome, d.numPatas, d.mediaOvos);
    }
}
