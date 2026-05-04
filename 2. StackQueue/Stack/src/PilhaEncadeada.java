import java.util.Arrays;

public class PilhaEncadeada {
    Celula topo;
    Celula fundo;
    Celula sentinela;

    public PilhaEncadeada(){
        sentinela = new Celula();
        topo = fundo = sentinela;
    }

    public void push(int elemento){
        Celula nova = new Celula(elemento);
        nova.setProx(topo);
        topo = nova;
    }

    public int pop(){
        if(isEmpty()) throw new IllegalStateException("Pilha vazia");
        int ultimoElemento = topo.getElemento();
        topo = topo.getProx();
        return ultimoElemento;
    }

    public boolean isEmpty() {
        return topo == fundo;
    }

    public int getTop(){
        if(isEmpty()) throw new IllegalStateException("Pilha vazia");
        return topo.getElemento();
    }
}

