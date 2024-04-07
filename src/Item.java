package src;

public class Item {
    private String nome;
    private double lanceAtual;
    private Cliente clienteAtual;

    public Item(String nome) {
        this.nome = nome;
        this.lanceAtual = 0.0;
        this.clienteAtual = null;
    }

    public String getNome() {
        return nome;
    }

    public double getLanceAtual() {
        return lanceAtual;
    }

    public Cliente getClienteAtual() {
        return clienteAtual;
    }

    public void definirLance(double valor, Cliente cliente) {
        this.lanceAtual = valor;
        this.clienteAtual = cliente;
    }

    public int getClienteAtualId() {
        return clienteAtual != null ? clienteAtual.getId() : -1; // Retorna -1 se o clienteAtual for null
    }
}