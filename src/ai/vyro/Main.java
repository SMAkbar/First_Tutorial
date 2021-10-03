
package ai.vyro;

class FreshJuice{
    enum FreshJuiceSize {SMALL, MEDIUM, LARGE}
    FreshJuiceSize size;
}

class Greet{
    public void greet(){
        System.out.println("hello World");
    }

    public String greet(String name){
        return "Hello Nothing";
    }
}


class GreetName extends Greet{
    public String greet(String name){
        return "Hello " + name;
    }
}

public class Main {

    public static void main(String args[]) {
        Greet greet = new GreetName();
        greet.greet();
        System.out.println(greet.greet("Akbar"));
    }
}
