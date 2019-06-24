package pl.paczka.zadania1;

public class Human {
    private String name;
    private boolean male;
    private Integer weight;
    private Integer height;
    private Integer age;

    public Human () {

    }
    public String getName() {
        return name;
    }

    public boolean isMale() {
        return male;
    }

    public Integer getWeight() {
        return weight;
    }

    public Integer getHeight() {
        return height;
    }

    public Integer getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMale(boolean male) {
        this.male = male;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
