public class main {
    public static void main(String[] args) {
        Pilha pilha = new Pilha(5);
    
        pilha.push(20);
        pilha.push(60);
        pilha.push(30);
        pilha.push(70);
        pilha.push(50);

        System.out.println("3 primeiros valores da pilha:");
        for (int i = 0; i < 3; i++) {
            System.out.println(pilha.numero[i]);
        }

        System.out.println("Primeiro elemento da pilha:");
        System.out.println(pilha.numero[0]);

        System.out.println("Removendo elementos e mostrando a pilha:");
        pilha.pop();
        for (int i = 0; i < pilha.numero.length; i++) {
            System.out.println(pilha.numero[i]);
        }
        pilha.pop();
        for (int i = 0; i < pilha.numero.length; i++) {
            System.out.println(pilha.numero[i]);
        }
    }
}