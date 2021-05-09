package com.sapunka;
// DEFAULT ACCESS METHOD
public class Main {
    public static void main(String[] args) {
        class Greetings{
             void hello(){
                System.out.println("\nHello world! How are you?");
            }
        }
        class Response{
             void good(){
                System.out.println("We are not good, so many problems in the world.");
            }
        }
        Greetings greetings = new Greetings();
        greetings.hello();

        Response response = new Response();
        response.good();
    }
}