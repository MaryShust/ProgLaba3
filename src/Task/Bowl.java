package Task;

public class Bowl extends Item {
    private Boolean isEmpty = true;
    Bowl() {
        super("миска");
    }

    public boolean getIsEmpty() {
        return isEmpty;
    }

    public void setIsEmpty(boolean isEmpty) {
        this.isEmpty = isEmpty;
    }
}
