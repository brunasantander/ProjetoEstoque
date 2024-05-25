import Controle.ProdutoControle;
import Entidade.Produto;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        ProdutoControle controle = new ProdutoControle();
        Produto produto1 = new Produto(1L, "Arroz", 10);
        Produto produto2 = new Produto(2L, "Feijão", 0);
        Produto produto3 = new Produto(3L, "Batata", 20);

        controle.salvarAcerto(1L, new Date(), 10, 'E', "Compra", produto1);
        controle.salvarAcerto(2L, new Date(), 20, 'E', "Compra", produto2);
        controle.salvarAcerto(3L, new Date(), 30, 'S', "Venda", produto3);
    }
}