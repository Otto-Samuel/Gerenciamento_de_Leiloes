package src;
public class No<T> {
    T dado;
    No<T> proximo;
    
    public No(T dado) {
        this.dado = dado;
        this.proximo = null;
    }
}
