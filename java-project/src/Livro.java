public class Livro {
    String nome;
    int numeroPaginas;
    double preço;
    Autor autor;

    public String getNome() {
        return nome;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public double getPreço() {
        return preço;
    }

    public Autor getAutor() {
        return this.autor;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public void setPreço(double preço) {
        this.preço = preço;
    }

    public void imprimirDados(){

        System.out.println("Informações do Livro");
        System.out.println("Nome:              " + this.getNome());
        System.out.println("Preço:             " + this.getPreço());
        System.out.println("Numero de páginas: " + this.getNumeroPaginas());
        System.out.println("---------------------------");
        this.autor.imprimirDados();
    }
}
