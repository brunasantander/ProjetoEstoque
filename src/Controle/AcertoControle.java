package Controle;

import Entidade.Acerto;
import Entidade.Produto;

import java.util.Date;

public class AcertoControle
{

    public static boolean gravar(Long id, int total, char tipo, String motivo, Produto produto) {
        Acerto acerto = new Acerto(id, total, tipo, motivo, produto);

        System.out.println(acerto);

        if (acerto.validaMotivo(acerto.getMotivo())) {
            if(produto.validaTotal(acerto.getTotal(), tipo, produto.getQuantidade())){
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
