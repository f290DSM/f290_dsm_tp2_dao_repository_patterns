package dao.factories;

import java.util.List;

import domain.Contato;

public interface IContatoDAO {
    void salvar(Contato contato);

    void atualizar(Contato contato);

    void excluir(Integer id);

    List<Contato> buscarTodos();

    Contato buscarPorEmail(String email);
}
