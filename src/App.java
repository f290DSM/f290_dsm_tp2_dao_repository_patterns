import java.sql.ResultSet;

import dao.factories.ConexaoFactory;

public class App {
    public static void main(String[] args) throws Exception {
        // ResultSet rst = ConexaoFactory.getConexao()
        //         .createStatement()
        //         .executeQuery("select version() as versao;");

        // if(rst.next()) {
        //     System.out.println(rst.getString("versao"));
        // }

        System.out.println(args[0]);
    }
}
