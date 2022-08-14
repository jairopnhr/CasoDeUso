package Model;

import java.io.Serializable;
import java.util.Objects;

public class ModeloGenerico implements Serializable {
protected Integer Id;


    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        this.Id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ModeloGenerico that = (ModeloGenerico) o;
        return Objects.equals(Id, that.Id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id);
    }





}
