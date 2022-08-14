package Controller;

import Database.Conexao;
import Database.SQL.SQL_CLIENTES;
import Model.ClienteModel;
import Model.DAO.ClienteDao;
import org.w3c.dom.Entity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class ClienteDaoImpl implements ClienteDao {

    @Override
    public void criarCliente(ClienteModel dao) {
        String sql = SQL_CLIENTES.InsertCliente + "VALUES (? ? ?)";
        Connection cn = Conexao.getConnection();
    try{
        PreparedStatement ps = cn.prepareStatement(sql);
        ps.setString(1,dao.getName());
        ps.setString(2,dao.getEmail());
        ps.setInt(3,35);
        ps.executeUpdate(sql);
    }catch (SQLException e){
        e.printStackTrace();
    }
    }

    @Override
    public List<ClienteModel> ListarClientes() {
        return null;
    }

    @Override
    public void excluirClientePeloId(Long id) {

    }

    @Override
    public void AlterarInformaçoes(ClienteModel clienteModel) {

    }
}
