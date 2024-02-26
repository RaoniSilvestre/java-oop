public class Main {
    public static void main(String[] args) {
        Livro reripoti = new Livro();
        Autor jkRoling = new Autor();
        Cliente joao = new Cliente();

        joao.setNome("João Marcos");
        joao.setDinheiro(10);
        joao.setEmail("joao.uchiha.@gmail.com");

        jkRoling.setNome("J.K. Roling");
        jkRoling.setGenero("Feminino");
        jkRoling.setIdade(36);


        reripoti.setNome("Harry Potter 1");
        reripoti.setAutor(jkRoling);
        reripoti.setPreço(39.99);
        reripoti.setNumeroPaginas(390);

        reripoti.imprimirDados();
        System.out.println();
        joao.comprarLivro(reripoti);



    }
}