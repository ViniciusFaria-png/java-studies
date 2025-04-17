import java.time.LocalDate;

public class Carro {
    String model;
    int year;
    String color;


    void display(){
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Color: " + color);
    }

    void ageVerification(){
        int actualAge = LocalDate.now().getYear();
        int idade = actualAge - this.year;
        System.out.println("A idade do carro é: " + idade + " anos");
    }
}
