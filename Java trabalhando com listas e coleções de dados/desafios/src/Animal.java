public class Animal {
    protected String nome;

    public Animal(String nome){
        this.nome = nome;
        System.out.println("Um animal chamado " + nome + " foi criado.");
    }

    public void fazerSom(){
        System.out.println("O animal faz um som");
    }
}
