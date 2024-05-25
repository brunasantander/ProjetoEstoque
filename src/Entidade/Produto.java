package Entidade;

import Model.ProdutoModel;

import java.util.List;

public class Produto
{
    private Long id;
    private String descricao;
    private int quantidade;

    public Produto(){}

    public Produto(Long id, String descricao, int quantidade) {
        this.id = id;
        this.descricao = descricao;
        this.quantidade = quantidade;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public boolean atualizarEstoque(Acerto acerto)
    {
        ProdutoModel model = new ProdutoModel();
        if (acerto.getTipo() == 'E') {
            this.quantidade += acerto.getTotal();
            return model.atualizarEstoque(this);
        } else {
            if(acerto.getTotal() > this.quantidade) {
                return false;
            }
            else {
                this.quantidade -= acerto.getTotal();
                return model.atualizarEstoque(this);
            }
        }
    }
}
