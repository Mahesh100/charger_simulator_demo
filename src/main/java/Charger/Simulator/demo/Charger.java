package charger.Simulator.demo;

import jakarta.inject.Singleton;

@Singleton
public class Charger {

   // Charger charger = new Charger();
    private int id;

    private String status;

//    public Charger() {
//
//    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setCity(String city) {
        this.city = city;
    }

    private String name;

    public String getCity() {
        return city;
    }

    private String city;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }



    public Charger(int id, String name, String city, String status) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.status=status;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
