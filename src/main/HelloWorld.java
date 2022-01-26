package main;

public class HelloWorld {
        public void welcome(String name) {
            if(name == null) {
                System.out.println("Hello World!");
            } else {
                System.out.println("Hello " + name + "!");
            }
        }
}
