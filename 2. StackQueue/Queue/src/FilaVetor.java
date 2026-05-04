import java.lang.reflect.Array;

public class FilaVetor<E> {
    E[] fila;
    int frente;
    int tras;
    int qnt;

    public FilaVetor(Class<E> tipo, int tamanho){
        fila = (E[]) Array.newInstance(tipo, tamanho);
        frente = tras = qnt = 0;
    }

    public void enfileirar(E elemento){
        if(isFull()) throw new IllegalStateException("Fila está cheia");
        fila[tras] = elemento;
        tras = (tras + 1) % fila.length;
        qnt++;
    }

    public void desenfileirar(){
        if(isEmpty()) throw new IllegalStateException("Fila está vazia");
        fila[frente] = null;
        frente = (frente + 1) % fila.length;
        qnt--;
    }

    public boolean isEmpty(){
        return qnt == 0;
    }

    public boolean isFull(){
        return qnt == fila.length; // ou (tras + 1 % fila.length == frente % fila.length)
    }

    public String imprimirFila(){
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < fila.length; i++) {
            s.append(fila[i] + " | ");
        }
        return s.toString();
    }
}
