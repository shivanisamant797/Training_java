// class Alien{
//     private String name;
//     private int age;

//     public Alien(String name, int age) {
//         this.name = name;
//         this.age = age;
//     }
//     public String getName() {
//         return name;
//     }
//     public int getAge() {
//         return age;
//     }

// }
//A record class in Java is a special kind of class designed mainly to store data with much less code.

record Alien(String name, int age) {}

public class Projects {
    public static void main(String[] args) {
        Alien alien1 = new Alien("Zorg", 300);
        Alien alien2 = new Alien("Xenon", 150);

        System.out.println(alien2);
    }
}
