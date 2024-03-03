package dia01;
public class Cliente {
    String nome;
    String email;
    double dinheiro;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDinheiro(double dinheiro) {
        this.dinheiro = dinheiro;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public double getDinheiro() {
        return dinheiro;
    }

    public void comprarLivro(Livro book){
        if (book.getPreço() > this.getDinheiro()){
            System.out.println("Compra não efetuada!");
        } else {
            System.out.println("Dinheiro no bolso, livro na mão\nCompra efetuada!");
        }
    }
}

