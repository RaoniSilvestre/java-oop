public class Autor {
    String nome;
    String genero;
    int idade;

    public int getIdade() {
        return idade;
    }

    public String getGenero() {
        return genero;
    }

    public String getNome() {
        return nome;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void imprimirDados(){
        System.out.println("Dados do Autor");
        System.out.println("Nome:   "+ this.getNome());
        System.out.println("Idade:  "+ this.getIdade());
        System.out.println("Genero: "+ this.getGenero());

    }
}
