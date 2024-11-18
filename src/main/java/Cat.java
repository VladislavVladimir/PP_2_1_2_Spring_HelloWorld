public class Cat {
    String name;
    int age;

    public Cat() {
    }

    public Cat setName(String name) {
        this.name = name;
        return this;
    }

    public Cat setAge(int age) {
        this.age = age;
        return this;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
