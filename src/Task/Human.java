package Task;

import java.util.function.Predicate;
import java.util.Random;

abstract class Human extends Matter implements InnateAbilities {

    private final State state;

    Human(String name, State state) {
        super(name);
        this.state = state;
    }

    private int getAttentiveness() {
        return new Random().nextInt(100);
    }

    @Override
    public void eat(Bowl bowl, String foodName) {
        bowl.setIsEmpty(true);
        System.out.println(name + " съел " + foodName + " из " + bowl.name);
    }

    
    @Override
    public void see(Matter matter, SeeProb seeProb) {
        if (seeProb.prob(getAttentiveness())) {
            System.out.println(name + " нашел " + matter.name);
        } else {
            System.out.println(name + " не нашел " + matter.name);
        }
    }

    public void put(Item item, Item itemPlace) {
        System.out.println(name + " положил " + item.name + " в " + itemPlace.name);
    }

    public State getState() {
        return state;
    }

    public void fillState() {
        System.out.println(name + " испытавает " + state.getTitle());
    }
}

