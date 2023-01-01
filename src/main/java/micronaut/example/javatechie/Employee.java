package micronaut.example.javatechie;

import jakarta.inject.Singleton;

@Singleton
public class Employee {

     private int id;
     private String name;

    public Employee(String name) {
        this.name = name;
    }

    public Employee(int id, String name) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
