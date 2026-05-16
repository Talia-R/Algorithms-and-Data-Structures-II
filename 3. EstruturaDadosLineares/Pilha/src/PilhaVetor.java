import java.lang.reflect.Array;
import java.util.Arrays;

public class PilhaVetor<E>{
    int tamanho;
    E[] pilha;
    int topo; // prox posicao livre

    public PilhaVetor(Class<E> tipo, int tamanho){
        this.tamanho = tamanho;
        pilha = (E[]) Array.newInstance(tipo, tamanho);
        topo = 0;
    }

    public void push(E elemento){
        if(isFull()) throw new IllegalStateException("Lista cheia");
        pilha[topo++] = elemento;
    }

    public E pop(){
        if(isEmpty()) throw new IllegalStateException("Lista vazia");
        E ultima = pilha[--topo];
        pilha[topo] = null;
        return ultima;
    }

    public boolean isEmpty(){
        return getTopo() == 0;
    }

    public boolean isFull() {
        return getTopo() == pilha.length;
    }

    public int getTopo(){
        return topo;
    }

    public void verPilha(){
        System.out.println(Arrays.toString(pilha));
    }
}