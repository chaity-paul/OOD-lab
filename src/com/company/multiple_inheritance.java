package com.company;

interface Animal {
    public void eat();
    public void run();
}
interface Cat extends Animal {
    public void meow();
}
interface Dog extends Animal {
    public void bark();
}
class Mammal implements Cat,Dog {
    public void eat(){
        System.out.println("Mammal eats");
    }
    public void run(){
        System.out.println("Mammal runs");
    }
    public void meow(){
        System.out.println("Mammal meows");
    }
    public void bark(){
        System.out.println("Mammal barks");
    }
    public static void main(String[] args){
        Mammal m = new Mammal();
        m.eat();
        m.run();
        m.meow();
        m.bark();
    }
}

