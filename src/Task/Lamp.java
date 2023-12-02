package Task;

import java.util.ArrayList;
import java.util.List;

public class Lamp extends Item {
    private final List<Item> attached = new ArrayList();

    Lamp() {
        super("лампа");
    }


    public void attach(Item item) {
        if (attached.contains(item)) {
            System.out.println("уже прикрепили " + item);
        } else {
            attached.add(item);
            System.out.println("прикрепили " + item);
        }
    }

    @Override
    public String toString() {
        if (attached.size() == 0) {
            return "На лампе ничего нет";
        }
        StringBuilder res = new StringBuilder("На лампе прекреплены: ");
        for (int i = 0; i < attached.size(); i++) {
            res.append(attached.get(i)).append(" ");
        }
        return res.toString();
    }
}