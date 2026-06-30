package model;

public class Tenis extends Produto {


    private String material;

    public Tenis(int id, String nome, int tipo, double preco, String material) {
        super(id, nome, tipo, preco);
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }


    @Override
    public void visualizar() {
        super.visualizar(); // Executa o visualizar da classe Produto
        System.out.println("Material: " + this.material); // Adiciona o detalhe do Tênis
    }
}
