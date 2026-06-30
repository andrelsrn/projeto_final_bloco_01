package controller;


import model.Produto;
import repository.ProdutoRepository;

import java.util.ArrayList;

public class ProdutoController implements ProdutoRepository {

    // Collection que funcionará como o banco de dados em memória
    private ArrayList<Produto> listaProdutos = new ArrayList<Produto>();

    @Override
    public void listarTodos() {
        if (listaProdutos.isEmpty()) {
            System.out.println("\nNão há produtos cadastrados!");
            return;
        }


        for (Produto produto : listaProdutos) {
            produto.visualizar();
        }
    }

    @Override
    public void listarPorId(int id) {
        Produto produto = buscarNaCollection(id);

        if (produto != null) {
            produto.visualizar();
        } else {
            System.out.println("\nO produto com o ID: " + id + " não foi encontrado!");
        }
    }

    @Override
    public void cadastrar(Produto produto) {
        listaProdutos.add(produto);
        System.out.println("\nO produto " + produto.getNome() + " foi cadastrado com sucesso!");
    }

    @Override
    public void atualizar(Produto produto) {
        Produto buscaProduto = buscarNaCollection(produto.getId());

        if (buscaProduto != null) {
            // O index remove o produto antigo e coloca o atualizado na mesma posição
            int indice = listaProdutos.indexOf(buscaProduto);
            listaProdutos.set(indice, produto);
            System.out.println("\nO produto com o ID: " + produto.getId() + " foi atualizado com sucesso!");
        } else {
            System.out.println("\nO produto com o ID: " + produto.getId() + " não foi encontrado para atualizar!");
        }
    }

    @Override
    public void deletar(int id) {
        Produto produto = buscarNaCollection(id);

        if (produto != null) {
            listaProdutos.remove(produto);
            System.out.println("\nO produto com o ID: " + id + " foi deletado com sucesso!");
        } else {
            System.out.println("\nO produto com o ID: " + id + " não foi encontrado para deletar!");
        }
    }

    private Produto buscarNaCollection(int id) {
        for (Produto produto : listaProdutos) {
            if (produto.getId() == id) {
                return produto;
            }
        }
        return null;
    }
}