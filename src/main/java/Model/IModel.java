package Model;

public interface IModel<T> {
    public boolean gravar(T entidade);
    public boolean atualizarEstoque(T entidade);
}
