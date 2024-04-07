package src;

public class Edital {
    private Fila<Item> itensLeilao;

    public Edital() {
        this.itensLeilao = new Fila<>();
    }
    public void adicionarItem(Item item) {
        this.itensLeilao.enqueue(item);
    }

    public void removerItem() {
        this.itensLeilao.dequeue();
    }

    public Item proximoItem() {
        return this.itensLeilao.peek();
    }

    public void passarParaProximoItem() {
        Item itemAtual = this.proximoItem();
        if (itemAtual != null) {
            System.out.println("\n[ Item leiloado: " + itemAtual.getNome() + " ]");
            System.out.println("[ Lance atual: " + itemAtual.getLanceAtual()+ " ]");
            System.out.println("[ Cliente que deu o último lance: " + (itemAtual.getClienteAtual() != null ? itemAtual.getClienteAtualId() : "Nenhum" + " ]"));
            this.removerItem();
        } else {
            System.out.println("Não há mais itens em leilão.");
        }
    }
}