package Task;

public enum Speed {
    FAST("быстро"),
    SLOWLY("медленно"),
    CHILLI("на чиле");

    private final String title;
    Speed(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
