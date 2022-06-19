public class Animal {
    int numPatas;
    String nome;
    int mediaOvos;
    
    public Animal(int numPatas, String nome){
        this.numPatas = numPatas;
        this.nome = nome;
    }

    public Animal(int numPatas, String nome, int mediaOvos) {
        this.numPatas = numPatas;
        this.nome = nome;
        this.mediaOvos = mediaOvos;
    }

	public String toString(){
        return String.format("Nome: %s", nome);
    }

}
