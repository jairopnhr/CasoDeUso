package Model;

import java.util.Objects;

public class ItemModel<Tp> {

    public ItemModel()
    {
    }
    private static final int QUANTIDADE_MAXIMA_DE_ITENS= 20;
    private String nome ;
    private Integer QTDEitem ;
    private  Tp Tp;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQTDEitem() {
        return QTDEitem;
    }

    public void setQTDEitem(Integer QTDEitem) {
        this.QTDEitem = QTDEitem;
    }

    public Tp getTP() {
        return Tp;
    }

    public void setTP(Tp TP) {
        this.Tp = TP;
    }

    @Override
    public String toString() {
        return "ItemModel{" +
                "nome='" + nome + '\'' +
                ", QTDEitem=" + QTDEitem +
                ", Tp=" + Tp +
                '}';
    }
}
