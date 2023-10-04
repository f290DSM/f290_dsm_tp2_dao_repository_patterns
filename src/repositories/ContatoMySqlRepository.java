package repositories;

import java.util.List;

import dao.factories.IContatoDAO;
import domain.ContatoVO;

public class ContatoMySqlRepository implements IContatoRepository{

    private IContatoDAO dao;

    public ContatoMySqlRepository(IContatoDAO dao) {
        this.dao = dao;
    }

    @Override
    public void salvar(ContatoVO contato) {
        dao.salvar(contato);
    }

    @Override
    public void atualizar(ContatoVO contato) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'atualizar'");
    }

    @Override
    public void excluir(Integer id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'excluir'");
    }

    @Override
    public List<ContatoVO> buscarTodos() {
        return dao.buscarTodos();
    }

    @Override
    public ContatoVO buscarPorEmail(String email) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buscarPorEmail'");
    }
    
}
