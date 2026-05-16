public class FilaEncadeada<E> {
    Celula<E> sentinela;
    Celula<E> frente;
    Celula<E> tras;

    public FilaEncadeada(){
        sentinela = new Celula<>();
        frente = tras = sentinela;
    }

    public void enfileirar(E item){
       Celula<E> novaCelula = new Celula<E>(item);
       tras.setProximo(novaCelula);
       tras = novaCelula;
    }

    public void desenfileirar(){
        if(isEmpty()) throw new IllegalStateException("Fila está vazia");
        Celula<E> item2AposSentinela = sentinela.getProximo().getProximo();
        sentinela.setProximo(item2AposSentinela);
        if(item2AposSentinela == null) tras = sentinela;
    }
    
    public boolean isEmpty(){
        return frente == tras;
    }

    public String imprimirFila(){
        StringBuilder s = new StringBuilder();
        Celula<E> atual = sentinela.getProximo();
        while(atual != null){
            s.append(atual.getItem() + " | " );
            atual = atual.getProximo();
        }

        return s.toString();
    }
}
