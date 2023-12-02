package Task;

abstract class MutantHuman extends Human implements Superpower {
    MutantHuman(String name, State state) {
        super(name, state);
    }

    @Override
    public void jump(Speed speed, String item) {
        System.out.println(name + " перемахнул " + speed.getTitle() + " через " + item);
    }
}