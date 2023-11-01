import java.util.Arrays;

import domain.exemplo2.*;

public class App {
    public static void main(String[] args) throws Exception {
        
        Produto produto = new Produto(1000.0);
        Produto produto2 = new Produto(500.0);

        Cliente cliente = new Cliente(5d); //"d" converte int para double
        Cliente cliente2 = new Cliente(0d); // --''--

        ItemPedido itemPedido = new ItemPedido(produto, 3);
        ItemPedido itemPedido2 = new ItemPedido(produto2, 2);

        Pedido pedido = new Pedido(Arrays.asList(itemPedido, itemPedido2));

    }
}