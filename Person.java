class Person{
 String name;
 int age;
public Person(){
  name = "unkown";
  age = 0;

}
public Person(String name) {
        this.name = name;
        age = 0;
    }
public Person(int age)
{
name = "unkown";
  this.age=age;
}

public Person(String name,int age) {
  this.name = name;
  this.age = age;

}
public void display(){
  System.out.println("name:"+name+",age:"+age);

}

}
public class ConstructorOverloadingExample {
  public static void main(String[]args){
    Person p1 = new Person();
    Person p2 = new Person(33);
    Person p3 = new Person("babu",55);
    p1.display();
    p2.display();
    p3.display();

  }
}
