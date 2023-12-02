package Task;

public class Clock extends Item {
    private final String time;
    private final int price;
    Clock(String time, int price) {
        super("часы");
        this.time = time;
        this.price = price;
    }

    public String getTime() {
        return time;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public int hashCode() {
        return (time.hashCode() * 100) + price;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Clock)) {
            return false;
        }
        Clock clock = (Clock) o;
        return this.time.equals(clock.getTime()) && this.price == clock.getPrice();
    }

    @Override
    public String toString() {
        return name + " за " + price + " на которых время сейча - " + time;
    }
}
