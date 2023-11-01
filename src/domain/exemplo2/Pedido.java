package domain.exemplo2;

import java.util.List;

public class Pedido {

    private Cliente cliente;

    private List<ItemPedido> itens;

    public Pedido(Cliente cliente, List<ItemPedido> itens) {
        this.cliente = cliente;
        this.itens = itens;
    }
    
    public Double calcularPreco() {
        Double valorFinal = 0.0;
        for (ItemPedido item : itens) {
            valorFinal += item.calcularPreco();
        }
        return cliente.obtervalorComDesconto(valorFinal);
    }

}