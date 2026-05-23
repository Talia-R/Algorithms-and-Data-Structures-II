import java.util.NoSuchElementException;

public class ListaEncadeada<E> {
    private Celula<E> primeiro, ultimo, sentinela;
    private int tamanho;

    public ListaEncadeada(){
        sentinela = new Celula<>();
        primeiro = ultimo = sentinela;
        tamanho = 0;
    }

    public void inserirFinal(E item){
        Celula<E> novaCelula = new Celula<>(item);
        ultimo.setProximo(novaCelula);
        ultimo = novaCelula;
        tamanho++;
    }

    public void inserirPosicao(E item, int posicao){
        if(posicao < 0 || posicao > tamanho) throw new IndexOutOfBoundsException("Posição informada inválida");
        Celula<E> anterior, novaCelula, proxima;

        anterior = primeiro;

        for (int i = 0; i < posicao ; i++)
            anterior = anterior.getProximo();

        novaCelula = new Celula<>(item);

        proxima = anterior.getProximo();
        anterior.setProximo(novaCelula);
        novaCelula.setProximo(proxima);

        if(posicao == tamanho){
            this.ultimo = novaCelula;
        }
        tamanho++;

    }

    public E remover(int posicao){
        if(vazia()) throw new IllegalStateException("Lista vazia");
        if(posicao < 0 || posicao >= tamanho) throw new IndexOutOfBoundsException("Posição inválida");

        Celula<E> anterior, removida, proxima;

        anterior = this.primeiro;

        for(int i = 0; i < posicao; i++)
            anterior = anterior.getProximo();

        removida = anterior.getProximo();
        proxima = removida.getProximo();

        anterior.setProximo(proxima);
        removida.setProximo(null);

        if(removida == this.ultimo) this.ultimo = anterior;

        tamanho--;

        return removida.getItem();
    }

    public E remover(E itemProcurado){
        if(vazia()) throw new IllegalStateException("Lista vazia"); 
        Celula<E> anterior, removida, proxima;
        anterior = primeiro;

        for(int i = 0; i < tamanho; i++){
            if(anterior.getProximo().getItem().equals(itemProcurado)) {
                removida = anterior.getProximo();
                proxima = removida.getProximo();

                anterior.setProximo(proxima);

                if(removida == this.ultimo) this.ultimo = anterior;

                removida.setProximo(null);

                tamanho--;

                return removida.getItem();
            }
            anterior = anterior.getProximo();
        }

        throw new NoSuchElementException("Item não encontrado");
    }

    public E removerInicio(){
        if(vazia()) throw new IllegalStateException("Lista vazia");

        Celula<E> removido, proximo;

        removido = primeiro.getProximo();
        proximo = removido.getProximo();
        
        this.primeiro.setProximo(proximo);
        removido.setProximo(null);

        if(removido == this.ultimo) ultimo = primeiro;

        tamanho--;

        return removido.getItem();
    }


    public boolean vazia(){
        return primeiro == ultimo;
    }

    public String imprimir(){
        StringBuilder s = new StringBuilder();
        Celula<E> atual = primeiro.getProximo();
        while(atual != null){
            s.append(atual.getItem() + " | ");
            atual = atual.getProximo();
        }
        return s.toString();
    }

    public int obterNumeroItens(){
        if(vazia()) return 0;
        return this.tamanho;
    }

    public E localizar(int posicao){
        if(vazia()) throw new IllegalStateException("Lista vazia");
        if(posicao < 0 || posicao > tamanho) throw new IndexOutOfBoundsException("Não existe essa posição na lista");
        
        Celula<E> aux = primeiro.getProximo();

        for(int i = 0; i < posicao; i++)
            aux = aux.getProximo();

        return aux.getItem();
    }

    public Celula<E> encontrarCelula(E item){
        Celula<E> procurada = primeiro.getProximo();

        for(int i = 0; i < tamanho; i++){
            if(procurada.getItem().equals(item))
                return procurada;
            
            procurada = procurada.getProximo();
        }

        throw new NoSuchElementException("Item não existe na lista.");
    }

    public void trocar(E itemX, E itemY){
        if(vazia()) throw new IllegalStateException("Lista vazia.");
        // acha x 
        // acha y
        //troco de lugar
        Celula<E> celulaX, celulaY;
        E aux;

        celulaX = encontrarCelula(itemX);
        celulaY = encontrarCelula(itemY);

        aux = celulaX.getItem();

        celulaX.item = celulaY.item;
        celulaY.item = aux;
    }
    
}
