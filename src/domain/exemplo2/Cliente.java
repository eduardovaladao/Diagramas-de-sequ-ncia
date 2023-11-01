package domain.exemplo2;

import java.util.List;

public class Cliente {

    private Double percentualDesconto;

    public Cliente(Double percentualDesconto) {
        this.percentualDesconto = percentualDesconto;
    }

    public Double obtervalorComDesconto(Double valorPedido) {
        double desconto = percentualDesconto / 100d;
        return valorPedido - (valorPedido * desconto);
    }

}