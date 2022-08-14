package Model;

public enum TipoItem {
    ELETRONICA("eletronica", 1l), LIMPEZA("Limpeza", 2l), BAZAR("Bazar", 3l),
    ALIMENTOS("Alimentos", 4l), BRINQUEDOS("Brinquedos", 5l);

    String nome;
    Long cd;

    TipoItem(String nome, Long cd) {
        this.nome = nome;
        this.cd = cd;


    }

    public Long getCd() {
        return cd;
    }

    public void setCd(Long cd) {
        this.cd = cd;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

