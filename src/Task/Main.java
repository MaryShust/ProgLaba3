package Task;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        Carlson carlson = new Carlson();
        Fill fill = new Fill();
        Rull rull = new Rull();
        Oskar oskar = new Oskar();
        Child child = new Child();

        carlson.jump(Speed.FAST, "подоконник");
        Wallet wallet = new Wallet();
        Bowl bowl = new Bowl();
        fill.eat(bowl, "суп");
        rull.eat(bowl, "суп");
        oskar.eat(bowl, "суп");
        carlson.put(wallet, bowl);
        if (bowl.getIsEmpty()) {
            System.out.println("не намок");
        } else {
            System.out.println("намок");
        }
        Clock clock = new Clock("12:32", 100);
        Clock clock_2 = new Clock("12:32", 100);
        Lamp lamp = new Lamp();
        lamp.attach(clock);
        lamp.attach(clock_2);
        System.out.println(lamp);
        fill.see(clock, value -> value > 70);
        rull.see(clock, value -> value > 70);
        oskar.see(clock, value -> value > 70);
        fill.see(carlson, value -> value > 70);
        rull.see(carlson, value -> value > 70);
        oskar.see(carlson, value -> value > 70);
        child.fillState();
    }
}



