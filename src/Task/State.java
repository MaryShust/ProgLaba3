package Task;

public enum State {
    FEAR("страх"),
    INDIFFERENCE("равнодушие"),
    NORMAL("обычное"),
    DESPAIR("отчаяние");

    private final String title;

    State(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}