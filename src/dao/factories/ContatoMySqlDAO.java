package dao.factories;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Objects;

import domain.Contato;

public class ContatoMySqlDAO implements IContatoDAO {

    private final Connection connection;

    public ContatoMySqlDAO(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void salvar(Contato contato) {
        StringBuilder builder = new StringBuilder();
        builder.append("INSERT INTO contatos (")
                .append("nome, email, telefone, linkedin) ")
                .append("values('%s', '%s', '%s', '%s')");

        String query = String.format(builder.toString(),
                contato.getNome(),
                contato.getEmail(),
                contato.getTelefone(),
                contato.getLinkedin());
                
        try (Statement stm = connection.createStatement()) {
            stm.execute(query);
        } catch (SQLException e) {
           e.printStackTrace();
        }

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
