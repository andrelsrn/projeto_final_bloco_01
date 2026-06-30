package model;

public class Produto {


    private int id;
    private String nome;
    private int tipo; // Ex: 1 - Tênis, 2 - Sapato Social
    private double preco;


    public Produto(int id, String nome, int tipo, double preco) {
        this.id = id;
        this.nome = nome;
        this.tipo = tipo;
        this.preco = preco;
    }


    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public int getTipo() { return tipo; }
    public void setTipo(int tipo) { this.tipo = tipo; }

    public double getPreco() { return preco; }
    public void setPreco(double preco) { this.preco = preco; }


    public void visualizar() {
        String tipoString = (this.tipo == 1) ? "Tênis" : "Sapato Social";
        System.out.println("\n*****************************************************");
        System.out.println("Dados do Produto:");
        System.out.println("*****************************************************");
        System.out.println("ID: " + this.id);
        System.out.println("Nome: " + this.nome);
        System.out.println("Tipo: " + tipoString);
        System.out.println("Preço: R$ " + this.preco);
    }
}
