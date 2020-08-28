package for_myself_testing.GOF_patterns.observer;

import java.util.List;

public class Subscriber implements Observer{
   String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(List<String> vacancies) {
        System.out.println("Dear "+ name + " dasd asdas \n" + vacancies +
                "asdddddddddddddasddaadsasd\n");
    }
}
