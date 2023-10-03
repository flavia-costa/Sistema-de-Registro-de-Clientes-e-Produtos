package registro;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome;
    private List<Produto> produtosAdquiridos = new ArrayList<>();

    public Cliente(String nome) {
        this.nome = nome;
    }
    
    public void adicionarProduto(Produto produto) {
        produtosAdquiridos.add(produto);
    }

    public String getNome() {
        return nome;
    }

    public List<Produto> getProdutosAdquiridos() {
        return produtosAdquiridos;
    }

    public double calcularTotalCompras() {
        double total = 0;
        for (Produto produto : produtosAdquiridos) {
            total += produto.getPreco();
        }
        return total;
    }
}