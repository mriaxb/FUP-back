package br.com.findurpoint;

public abstract class AbstractEntity {

    private Long id;
    private boolean ativo;


    public AbstractEntity(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
}

