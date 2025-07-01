
import java.io.*;
class Animal {
    public void makeSound() throws Exception {
        System.out.println("Animal makes sound");
    }
}
class Dog extends Animal {
    @Override
    //calls parent class function
    public void makeSound() throws IOException {
        System.out.println("Dog barks");
        throw new IOException("Dog cannot make this sound!");
    }
}
public class MethodOverRiddingExecption {
    public static void main(String[] args) {
        Animal animal = new Dog();
        try {
            animal.makeSound();
        } catch (IOException e) {
            System.out.println("Caught IOException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Caught general Exception: " + e.getMessage());
        }
    }
}
