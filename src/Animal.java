public class Animal {
    private String color;
    private int age;
    private char gender;
public Animal(){}
    public Animal(String color, int age, char gender) {
        this.color = color;
        this.age = age;
        this.gender = gender;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "color='" + color + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}

