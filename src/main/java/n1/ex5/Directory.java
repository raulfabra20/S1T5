package n1.ex5;

import java.io.*;

public class Directory {
    public static void testMethods(){
        Person person = new Person("Raul", 27);
        serializePerson(person);
        deserializePerson();

    }
    public static void serializePerson(Person person) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("person.ser"))){
            out.writeObject(person);
            System.out.println("Person serialized successfully");
            } catch(IOException e){
                e.printStackTrace();
            }
        }

    public static void deserializePerson(){
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("person.ser"))){
            Person deserializedPerson = (Person) in.readObject();
            System.out.println("Person deserialized successfully:");
            System.out.println("Name: "+deserializedPerson.getName()+", age: "+deserializedPerson.getAge());
        } catch(IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
