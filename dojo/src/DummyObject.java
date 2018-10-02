public class DummyObject {

    public int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(final int number) {
        this.number = number;
    }

    public DummyObject(final int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "DummyObject{" +
                "number=" + number +
                '}';
    }
}
