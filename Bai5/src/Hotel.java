import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* Welcome to project
    @author: tienb
    Date: 11/5/2022
    Time: 11:51 AM
    
    ProjectName: Bai5
*/public class Hotel {
    private List<Person> persons;

    public Hotel() {
        this.persons = new ArrayList<>();
    }
    // add person
    public void addPerson(Person person){
        this.persons.add(person);
    }
    // delete person
    public boolean deletePerson(String passport){
        Person person = this.persons.stream().filter(o-> o.getPassport().equals(passport)).findFirst().orElse(null);
        if(person == null){
            return false;
        }else{
            this.persons.remove(person);
            return true;
        }
    }
    // calculator price room
    public int calculator(String passport){
        Person person = this.persons.stream().filter(o->o.getPassport().equals(passport)).findFirst().orElse(null);
        if (person == null){
            return 0;
        }else{
            return person.getRoom().getPrice()*person.getNumberRent();
        }
    }
    // show information
    public void show(){
        this.persons.forEach(o-> System.out.println(o.toString()));
    }
}
