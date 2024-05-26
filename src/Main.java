import Controle.AcertoControle;
import Entidade.Produto;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        AcertoControle controle = new AcertoControle();
        Produto produto1 = new Produto(1L, "Arroz", 10);
        Produto produto2 = new Produto(2L, "Feijão", 0);
        Produto produto3 = new Produto(3L, "Batata", 20);

        System.out.println(new Date());
        controle.gravar(1L, 0, 'E', "Compra", produto1);
        controle.gravar(2L, 10, 'E', "Compra", produto1);
        controle.gravar(3L, 0, 'S', "Venda", produto1);
        controle.gravar(3L,30, 'S', "Venda", produto1);
        controle.gravar(3L, 10, 'S', "Venda", produto1);
    }
}