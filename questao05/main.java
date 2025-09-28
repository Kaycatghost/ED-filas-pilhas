public class main {
    
    public static void main(String[] args) {
        Fila fila = new Fila(5);
        fila.valor(10);
        fila.valor(30);
        fila.valor(40);
        fila.valor(50);
        fila.valor(90);

        System.out.println("O primeiro numero na fila: ");
        fila.peek();

        System.out.println("Removendo numeros da fila: ");
        for (int i = 0; i < 3; i++){
            fila.peek();
            fila.dequeue();
        }
    
    }
}
