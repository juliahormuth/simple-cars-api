package springbootproject.cars.domain;

public class Car {
    private Long id;
    private String name;

    public Car(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId() {
        this.id = id;
    }

    public String getName() {
        return name;
    }


}
