package repositories;

import java.util.List;

import dao.factories.IContatoDAO;
import domain.Contato;

public class ContatoMySqlRepository implements IContatoRepository{

    private IContatoDAO dao;

    public ContatoMySqlRepository(IContatoDAO dao) {
        this.dao = dao;
    }

    @Override
    public void salvar(Contato contato) {
        //TODO: Validar o obejto contato
        dao.salvar(contato);
    }

    @Override
    public void atualizar(Contato contato) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'atualizar'");
    }

    @Override
    public void excluir(Integer id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'excluir'");
    }

    @Override
    public List<Contato> buscarTodos() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buscarTodos'");
    }

    @Override
    public Contato buscarPorEmail(String email) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buscarPorEmail'");
    }
    
}
