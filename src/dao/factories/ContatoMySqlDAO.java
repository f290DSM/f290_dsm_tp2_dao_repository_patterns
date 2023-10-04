package dao.factories;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import domain.Contato;

public class ContatoMySqlDAO implements IContatoDAO {

    private final Connection connection;
    private final Logger logger;

    public ContatoMySqlDAO(Connection connection) {
        this.connection = connection;
        this.logger = Logger.getLogger(this.getClass().getSimpleName());
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
        //TODO: Declarar lista de contatos
        List<Contato> contatos = new ArrayList<>();
        String query = "SELECT id, nome, email, telefone, linkedin FROM contatos;";
        try (Statement stm = connection.createStatement();
                ResultSet rst = stm.executeQuery(query)) {
            // Percorrer o ResulSet e preencher a lista de contatos
            while(rst.next()) {
                Contato contato = new Contato(
                    rst.getInt("id"), 
                    rst.getString("nome"), 
                    rst.getString("email"), 
                    rst.getString("telefone"), 
                    rst.getString("linkedin"));
                // Adicionar o objeto criado com base na consulta para a lista
                contatos.add(contato);
            }
        } catch (Exception e) {
            // Adicionar LOG
            logger.log(Level.SEVERE, "Falha ao conultar contatos.", e);
        }

        // Retornar a lista de contatos
        return contatos;
    }

    @Override
    public Contato buscarPorEmail(String email) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buscarPorEmail'");
    }

}
