package ex06

fun main() {
    //클래스
    val dog = Dog("퍼피")

    println(dog.age)    //0

    dog.age = 20

    println(dog.age)    //20
    //JAVA와 다르게 Getter, Setter처럼 캡슐화를 안해도 접근가능

    dog.eat()   //퍼피 식사시작
    dog.bark()  //퍼피 멍멍
}

//인터페이스
interface Bark{
    fun bark()
}

interface Temp{
    fun hi()
}

//추상클래스
//생성자 메소드를 바로 만든 셈
abstract class Animal(
    private val name: String?= ""
):Bark {
    //body
    fun eat(){
        println("$name 식사시작")
    }
}

//상속 => implements 나 extends 모두 :으로 사용
//생성자 메소드
class Dog(

    private val name: String?= null,
    var age: Int?=0 //0으로 초기화 안하면 기본으로 null

) : Animal(name), Temp{   //부모메소드에 name전달 super(name)과 같음

    //다중상속 =>  : Animal(name), Temp
    //Temp뒤 ()생성자 안해도 되는 이유 : Animal은 name을 기본 생성자가 되어있는 반면 Temp는 없음
    override fun bark() {
        println("$name 멍멍")
    }

    override fun hi() {
        println("bye")
    }
}



/* [JAVA비교]
package org.example.ex04;

interface Bark{
    void bark();
}

abstract class Animal implements Bark{
    private final String name;

    //클래스 이름과 동일한 메소드는 생성자 메소드
    public Animal(String name){
        this.name = name;
    }

    public void eat(){
        System.out.println(name+" 식사 시작");
    }

    public String getName() {
        return name;
    }
}

class Dog extends Animal{

    public Dog(){
        super("");
    }

    public Dog(String name){
        super(name);
    }

    public void eat(){
        super.eat();
    }

    @Override
    public void bark() {
        System.out.println(this.getName()+"멍멍");
    }
}

public class Exam06 extends Dog{

    public Exam06(){

    }

    public static void main(String[] args){
        Dog dog = new Dog("퍼피");
        dog.eat();
        dog.bark();
    }
    /*
        퍼피 식사 시작
        멍멍
    */
}
*/
