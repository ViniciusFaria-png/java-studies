public class Cachorro extends Animal {

    public Cachorro(String nome){
        super(nome);
        System.out.println("... e ele é um cachorro!");
    }

    @Override
    public void fazerSom() {
        System.out.println(nome + " au au au");
    }
}
