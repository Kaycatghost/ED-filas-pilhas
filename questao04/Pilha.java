public class Pilha {
    int[] numero;

    public Pilha(int maximo) {
        numero = new int[maximo];
    }

    public void push(int num) {
        for (int i = 0; i < numero.length; i++) {
            if (numero[i] == 0) {
                numero[i] = num;
                break;
            }
        }
    }

    public void pop() {
        for (int i = numero.length - 1; i >= 0; i--) {
            if (numero[i] != 0) {
                numero[i] = 0;
                break;
            }
        }
    }

    public void peek() {
        for (int i = numero.length - 1; i >= 0; i--) {
            if (numero[i] != 0) {
                System.out.println(numero[i]);
                break;
            }
        }
    }
    
    public void isEmpty() {
        boolean vazio = true;
        for (int i = 0; i < numero.length; i++) {
            if (numero[i] != 0) {
                vazio = false;
                break;
            }
        }
        System.out.println(vazio);
    }
}