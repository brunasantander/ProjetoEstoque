package Entidade;

import Model.AcertoModel;

import java.util.Date;

public class Acerto {
    private Long id;
    private int total;
    private char tipo;
    private String motivo;
    private Produto produto;

    public Acerto() {
    }

    public Acerto(Long id, int total, char tipo, String motivo, Produto produto) {
        this.id = id;
        this.total = total;
        this.tipo = tipo;
        this.motivo = motivo;
        this.produto = produto;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public boolean validaMotivo(String motivo) {
        return !motivo.isEmpty();
    }

    public boolean gravar () {
        AcertoModel model = new AcertoModel();
        return model.gravar(this);
    }
}
