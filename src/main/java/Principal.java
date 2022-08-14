import Controller.ClienteDaoImpl;
import Model.ClienteModel;

public class Principal {
    public static void main(String[] args) {
        ClienteModel cl = new ClienteModel();
        cl.setEmail("Carlooos@gmail.com");
        cl.setName("carrloos");
        cl.setIdade(35);
        ClienteDaoImpl imp = new ClienteDaoImpl();
        imp.criarCliente(cl);

    }




}
