public class Celula {
    int elemento;
    Celula prox;
    
    public Celula(){
        this(0);
    }

    public Celula(int x){
        elemento = x;
        this.prox = null;
    }

    public int getElemento(){
        return elemento;
    }

    public void setProx(Celula elemento){
        this.prox = elemento;
    }

    public Celula getProx() {
        return prox;
    }
}
