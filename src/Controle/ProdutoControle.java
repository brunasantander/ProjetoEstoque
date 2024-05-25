package Controle;

import Entidade.Acerto;
import Entidade.Produto;

import java.util.Date;

public class ProdutoControle
{

    public boolean salvarAcerto(Long id, Date data, int total, char tipo, String motivo, Produto produto) {
        Acerto acerto = new Acerto(id, data, total, tipo, motivo, produto);

        System.out.println(acerto);

        if (acerto.validaMotivo(acerto.getMotivo())) {
            if(acerto.validaTotal(acerto.getTotal())){
                if(produto.atualizarEstoque(acerto)) {
                    System.out.println("OK");
                    return acerto.gravar();
                }
            }
            else {
                System.out.println("Erro");
                return false;
            }
            System.out.println("Erro");
            return false;
        }
        else {
            System.out.println("Erro");
            return false;
        }
    }
}
