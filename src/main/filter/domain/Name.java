package main.filter.domain;

public class Name {
    private String name;
    private int age;

    public Name(String name, int age) {
        this.name = name;
        this.age = age;
    }

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

    @Override
    public String toString() {
        return "Name{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
