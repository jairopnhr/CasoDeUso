package Model;

import java.util.List;
import java.util.Objects;

public class ClienteModel extends ModeloGenerico
{
    public ClienteModel() {
    }

    public ClienteModel(Integer matricula, String name, String email, Integer idade) {
        this.Id = matricula;
        this.name = name;
        this.email = email;
        this.idade = idade;
    }


    private String name;
    private String email ;
    private Integer idade;

    private List<PedidoModel> list;

    public Integer getId() {
        return Id;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public List<PedidoModel> getList() {
        return list;
    }

    public void setList(List<PedidoModel> list) {
        this.list = list;
    }


}
