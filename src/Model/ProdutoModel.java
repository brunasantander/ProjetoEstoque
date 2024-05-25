package Model;

import Model.IModel;
import Entidade.Produto;

public class ProdutoModel implements IModel<Produto> {
    @Override
    public boolean gravar(Produto prod) {
        return false;
    }

    @Override
    public boolean atualizarEstoque(Produto prod) {
        return true;
    }
}
