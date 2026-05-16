public class Mergesort{
    int[] array;

    public Mergesort(int[] array){
        this.array = array;
    }

    public void mergesort(int inicio, int fim){
        if(inicio < fim){
            int meio = (inicio + fim) / 2;
            mergesort(inicio, meio);
            mergesort(meio + 1, fim);
            intercalar(inicio, meio,fim);
        }
    }

    public void intercalar(int inicio, int meio,int fim){
        int n1, n2, i, j, k;

        //Definir tamanho dos dois subarrays
        n1 = meio - inicio + 1;
        n2 = fim - meio;
        
      	int[] a1 = new int[n1];
      	int[] a2 = new int[n2];

      	//Inicializar primeiro subarray
        for (i = 0; i < n1; i++) {
            a1[i] = array[inicio + i];
        }

      	//Inicializar segundo subarray
      	for (j = 0; j < n2; j++) {
        	a2[j] = array[meio + j + 1];
      	}

	    //Intercalação propriamente dita
        for (i = j = 0, k = inicio; (i < n1 && j < n2); k++) {
            if (a1[i] <= a2[j])
                array[k] = a1[i++];
            else
                array[k] = a2[j++];
        }

        if (i == n1)
            for (; k <= fim; k++) {
                array[k] = a2[j++];
            }
        else
            for (; k <= fim; k++) {
                array[k] = a1[i++];
            }

    }

}



// [5, 8 , 9, 2, 8, 15 , 4,3]
// dividir ao meio 
// [5, 8, 9, 2] // [8, 15, 4,3] -> merge entra aqui pra chamada recursiva
// [5, 8] // [9, 2]
// [5]  [8]  // [9] [2]