package repositories;

import java.util.List;

import domain.Contato;

public interface IContatoRepository {
    void salvar(Contato contato);

    void atualizar(Contato contato);

    void excluir(Integer id);

    List<Contato> buscarTodos();

    Contato buscarPorEmail(String email);
}
