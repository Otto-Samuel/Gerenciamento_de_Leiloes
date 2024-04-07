package src;
public class Sessao {
    private Pilha<Double> historicoLances;

    public Sessao() {
        this.historicoLances = new Pilha<>();
    }

    public void adicionarUltimoLance(double lance) {
        this.historicoLances.push(lance);
    }

    public double obterUltimoLance() {
        if (!this.historicoLances.isEmpty()) {
            return this.historicoLances.peek();
        } else {
            return 0.0;
        }
    }
}

