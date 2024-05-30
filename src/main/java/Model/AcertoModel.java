package Model;

import Entidade.Acerto;
import Entidade.Produto;

public class AcertoModel implements IModel<Acerto> {
    @Override
    public boolean gravar(Acerto acerto) {
        return true;
    }

    @Override
    public boolean atualizarEstoque(Acerto acerto) {
        return false;
    }
}
