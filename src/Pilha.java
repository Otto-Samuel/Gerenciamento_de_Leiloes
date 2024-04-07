package src;
public class Pilha<T> {
    private No<T> topo;
    
    public void push(T elemento) {
        No<T> novoNo = new No<>(elemento);
        novoNo.proximo = this.topo;
        this.topo = novoNo;
    }
    
    public T pop() {
        if (this.isEmpty())
            return null;
        T elemento = this.topo.dado;
        this.topo = this.topo.proximo;
        return elemento;
    }
    
    public T peek() {
        if (this.isEmpty())
            return null;
        return this.topo.dado;
    }
    
    public boolean isEmpty() {
        return this.topo == null;
    }
}