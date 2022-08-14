package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    public static Connection getConnection()
    {
        Connection connection = null;
        try {
             connection =DriverManager.getConnection(InformacoesDB.URL,
                    InformacoesDB.USER_NAME,
                    InformacoesDB.PASSWORD);
        }catch (SQLException e)
        {
            e.printStackTrace();
        }

            return connection;
    }
public void close(Connection connection)
{
    try {
        if (connection !=null && connection.isClosed()){
            connection.close();
        }
    }catch (SQLException d)
    {
        d.printStackTrace();
    }

}


}
