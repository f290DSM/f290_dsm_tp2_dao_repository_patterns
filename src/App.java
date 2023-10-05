import java.sql.Connection;
import java.util.List;

import dao.factories.ConexaoFactory;
import dao.factories.ContatoMySqlDAO;
import dao.factories.IContatoDAO;
import domain.ContatoVO;
import repositories.ContatoInMemoryRepository;
import repositories.ContatoMySqlRepository;
import repositories.IContatoRepository;
import services.ContatoService;
import services.IContadoService;

public class App {
    public static void main(String[] args) throws Exception {

        //Connection conexao = ConexaoFactory.getConexao();
        //IContatoDAO dao = new ContatoMySqlDAO(conexao);
        IContatoRepository repository = new ContatoInMemoryRepository();

        IContadoService service = new ContatoService(repository);

        // TODO: Criar objeto ContatoVO e realizar chamada do metodo salvar do service
        ContatoVO c1 = new ContatoVO(
                null,
                "João Pedro Ferreira",
                "jpferreira@gmail.com",
                "19999997878",
                "jpferreira_li");
        // Chamada do metodo de persistencia
        service.salvar(c1);
        // Buscar os contatos cadastrados na base de dados
        List<ContatoVO> contatos = service.buscarTodos();
        //Listar os contatos
        System.out.println(contatos);
        // create table if not exists fatec.contato()
    }
}
