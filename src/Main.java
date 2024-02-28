import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /**
         * Animal деген класс тузунуз,аны мурастаган 3класс болсун
         * Shark, Turtle, Eagle.
         * Shark (color,age,gender, attack ()метод )
         * Turtle (color,age,gender, swim()метод)
         * Eagle (color,age,gender,fly()метод)
         * Массив тузуп ичине Animal бы мурастаган класстарды
         * салыныздар
         * 1.Animal дардын ичинен ак тустогу жаныбардарды
         * алыныздар
         * 2.Animal ды gender aркылуу алган метод тузунуздор
         * 3.getShark метод тузунуздор
         */
        Animal[] animals = new Animal[3];
        animals[0] = new Shark("white", 3, 'J');
        animals[1] = new Turtle("green", 5, 'M');
        animals[2] = new Eagle("brawn", 3, 'M');


        for (Animal animal : animals) {
            if (animal.getColor().equalsIgnoreCase("white")) {
                System.out.println(animal);
            }
        }
            System.out.println();
            for (Animal animal1 : animals) {
                if (animal1 instanceof Shark) {
                    ((Shark) animal1).attack();
                } else if (animal1 instanceof Turtle) {
                    ((Turtle) animal1).swim();
                } else if (animal1 instanceof Eagle) {
                    ((Eagle) animal1).fly();
                }
            }
            System.out.println();
            getShark();

        }


    public static void getShark() {
        Animal animal1 = new Shark("white", 3, 'J');
        System.out.println("animal1.getColor() = " + animal1.getColor());
        System.out.println("animal1.getAge() = " + animal1.getAge());
        System.out.println("animal1.getGender() = " + animal1.getGender());

    }
}
