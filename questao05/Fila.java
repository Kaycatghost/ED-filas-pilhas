public class Fila {
    int[] numero;

    public Fila(int maximo) {
        this.numero = new int[maximo];
    }

    public void valor(int valor) {
        for (int i = 0; i < this.numero.length; i++) {
            if (this.numero[i] == 0) {
                this.numero[i] = valor;
                break;
            }
        }
    }
    public void dequeue() {
        for (int i = 0; i < this.numero.length; i++) {
            if (this.numero[i] != 0) {
                this.numero[i] = 0;
                break;
            }
        }
    }
    public void peek() {
        for (int i = 0; i < this.numero.length; i++) {
            if (this.numero[i] != 0) {
                System.out.println(this.numero[i]);
                break;
            }
        }
    }

    public void isEmpty() {
        for (int i = 0; i < this.numero.length; i++) {
            if (this.numero[i] == 0) {
                System.out.println(true);
                break;
            }
        }
    }
    
}
