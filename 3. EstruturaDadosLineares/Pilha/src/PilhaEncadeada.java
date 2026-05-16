import java.util.Arrays;

public class PilhaEncadeada<E> {
    Celula<E> topo;
    Celula<E> fundo;
    Celula<E> sentinela;

    public PilhaEncadeada(){
        sentinela = new Celula<E>();
        topo = fundo = sentinela;
    }

    public void push(E elemento){
        Celula<E> nova = new Celula<E>(elemento);
        nova.setProx(topo);
        topo = nova;
    }

    public E pop(){
        if(isEmpty()) throw new IllegalStateException("Pilha vazia");
        E ultimoElemento = topo.getElemento();
        topo = topo.getProx();
        return ultimoElemento;
    }

    public boolean isEmpty() {
        return topo == fundo;
    }

    public E getTopo(){
        if(isEmpty()) throw new IllegalStateException("Pilha vazia");
        return topo.getElemento();
    }

    private PilhaEncadeada<E> inverter(){
        Celula<E> atual = topo;
        PilhaEncadeada<E> pilhaInvertida = new PilhaEncadeada<>();
        while(atual != sentinela){
            pilhaInvertida.push(atual.getElemento());
            atual = atual.getProx();
        }
        return pilhaInvertida;
    }

    public void concatenar(PilhaEncadeada<E> outraPilha){
        if(outraPilha == null) throw new IllegalStateException("Pilha nula");
        PilhaEncadeada<E> invertida = outraPilha.inverter();
        Celula<E> elementoAtual = invertida.topo;
        while(elementoAtual != invertida.sentinela){
            push(elementoAtual.getElemento());
            elementoAtual = elementoAtual.getProx();
        }
    }

    public String imprimir(){
        StringBuilder s = new StringBuilder();
        PilhaEncadeada<E> invertida = inverter();
        Celula<E> atual = invertida.topo;
        while(atual != invertida.sentinela){
            s.append(atual.getElemento() + "\n");
            atual = atual.getProx();
        }
        return s.toString();
    }

    public int obterNumeroItens(){
        int qnt=0;
        Celula<E> atual = topo;
        while(atual != sentinela){
            atual = atual.getProx();
            qnt++;
        }
        return qnt;
    }

    public boolean ehPalindromo(){
        PilhaEncadeada<E> auxiliar = inverter();
        Celula<E> atual = topo;
        Celula<E> atualAuxiliar = auxiliar.topo;
        while(atual != sentinela){
            if(!atual.getElemento().equals(atualAuxiliar.getElemento())) return false;
            atual = atual.getProx();
            atualAuxiliar = atualAuxiliar.getProx();
        }
        return true;
    }
}

