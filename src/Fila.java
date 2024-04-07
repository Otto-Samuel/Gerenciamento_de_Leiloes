package src;

public class Fila<T> {
    private No<T> inicio;
    private No<T> fim;
    
    public void enqueue(T elemento) {
        No<T> novoNo = new No<>(elemento);
        if (isEmpty()) {
            inicio = novoNo;
            fim = novoNo;
        } else {
            fim.proximo = novoNo;
            fim = novoNo;
        }
    }
    
    public T dequeue() {
        if (isEmpty())
            return null;
        T elemento = inicio.dado;
        inicio = inicio.proximo;
        if (inicio == null)
            fim = null;
        return elemento;
    }
    
    public T peek() {
        if (isEmpty())
            return null;
        return inicio.dado;
    }
    
    public boolean isEmpty() {
        return inicio == null;
    }
}