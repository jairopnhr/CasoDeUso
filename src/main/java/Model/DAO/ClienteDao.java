package Model.DAO;

import Model.ClienteModel;

import java.util.List;

public interface ClienteDao {
    void criarCliente(ClienteModel dao);

    List<ClienteModel> ListarClientes();

    void excluirClientePeloId(Long id);

    void AlterarInformaçoes(ClienteModel clienteModel );

}
