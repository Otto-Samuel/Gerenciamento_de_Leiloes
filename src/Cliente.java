package src;

public class Cliente {
    private int id;
    private Pilha<Item> itensComprados;

    public Cliente(int id) {
        this.id = id;
        this.itensComprados = new Pilha<>();
    }

    public void darLance(Item item, double valor) {
        if (item != null && valor > item.getLanceAtual()) {
            item.definirLance(valor, this);
        } else {
            System.out.println("Lance inválido. O valor precisa ser maior que o lance atual.");
        }
    }

    public int getId() {
        return id;
    }

    public Pilha<Item> getItensComprados() {
        return itensComprados;
    }
}
