public class IdadePessoa {
    private String name;
    private int age;


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void verificarIdade(){
        if (age >= 18){
            System.out.println("É maior de idade");
        } else {
            System.out.println("Não é maior de idade");
        }
    }
}
