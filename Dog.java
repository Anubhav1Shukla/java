
class Animal
{
    void eat(){
        System.out.println("I am eating.");
    }
}
public class Dog extends Animal
{
public static void main
(String[] args){
        Dog d=new Dog();
        d.eat();
}
}