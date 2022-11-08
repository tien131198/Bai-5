import java.sql.SQLOutput;
import java.util.Scanner;

/* Welcome to project
    @author: tienb
    Date: 11/5/2022
    Time: 11:48 AM
    
    ProjectName: Bai5
*/public class Person {
    private String name;
    private int age;
    private String passport;
    private Room room;
    private int numberRent;

    public Person() {
    }

    public Person(String name, int age, String passport, Room room, int numberRent) {
        this.name = name;
        this.age = age;
        this.passport = passport;
        this.room = room;
        this.numberRent = numberRent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public int getNumberRent() {
        return numberRent;
    }

    public void setNumberRent(int numberRent) {
        this.numberRent = numberRent;
    }
    public Person insert(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name");
        String name = scanner.nextLine();
        System.out.println("Enter age");
        int age = scanner.nextInt();
        System.out.println("Enter passport");
        scanner.nextLine();
        String passport = scanner.nextLine();
        System.out.println("Choice a to rent room type A");
        System.out.println("Choice a to rent room type B");
        System.out.println("Choice a to rent room type C");
        String choice = scanner.nextLine();
        if (choice.equalsIgnoreCase("A")){
            room = new RoomA();
            System.out.println("ok");
        }else if (choice.equalsIgnoreCase("B")){
            room = new RoomB();
        }else if (choice.equalsIgnoreCase("C")) {
            room = new RoomC();
        }
        System.out.println("Enter number day for rent");
        int numberRent = scanner.nextInt();
        Person person = new Person(name, age, passport,room , numberRent);
        return person;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", passport='" + passport + '\'' +
                ", room=" + room +
                ", numberRent=" + numberRent +
                '}';
    }
}
