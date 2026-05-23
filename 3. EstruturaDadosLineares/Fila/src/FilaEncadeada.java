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

    public Celula<E> desenfileirar(){
        if(isEmpty()) throw new IllegalStateException("Fila está vazia");

        Celula<E> atual = frente.getProximo();

        if(atual.getProximo() == null) tras = frente;

        frente.setProximo(atual.getProximo());

        atual.setProximo(null);

        return atual;
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

    public int obterNumItensAFrente(E item){
        int qnt = 0;
        Celula<E> atual = frente.getProximo();
        while(atual != null){
            if(atual.getItem().equals(item)) return qnt;
            qnt++;
            atual = atual.getProximo();
        }
        throw new IllegalStateException("Item não encontrado na fila");
    }

    public FilaEncadeada<E> dividir(){
        FilaEncadeada<E> filaAux = new FilaEncadeada<>();
        FilaEncadeada<E> filaPar = new FilaEncadeada<>();
        boolean par = true;

        while(!isEmpty()){
            if(par){
                filaPar.enfileirar(desenfileirar().getItem());
            } else{
                filaAux.enfileirar(desenfileirar().getItem());
            }
            par = !par;
        }

        while(!filaAux.isEmpty()){
            enfileirar(filaAux.desenfileirar().getItem());
        }

        return filaPar;
    }


}
