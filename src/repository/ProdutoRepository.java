package repository;

import model.Produto;

public interface ProdutoRepository {

    void listarTodos();
    void listarPorId(int id);
    void cadastrar(Produto produto);
    void atualizar(Produto produto);
    void deletar(int id);
}
