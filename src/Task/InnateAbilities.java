package Task;

interface InnateAbilities {
    public void eat(Bowl bowl, String foodName);
    public void see(Matter matter, SeeProb seeProb);
}

interface SeeProb {
    boolean prob(Integer value);
}