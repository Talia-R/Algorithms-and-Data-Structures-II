public class Celula<E> {
    E elemento;
    Celula<E> prox;
    
    public Celula(){
        this.elemento = null;
        setProx(null);
    }

    public Celula(E x){
        elemento = x;
        this.prox = null;
    }

    public E getElemento(){
        return elemento;
    }

    public void setProx(Celula<E> elemento){
        this.prox = elemento;
    }

    public Celula<E> getProx() {
        return prox;
    }
}
