public class Printer {

    int sheetsLeft;
    int tonerLeft;


    public Printer(int sheetsLeft, int tonerLeft) {
        this.sheetsLeft = sheetsLeft;
        this.tonerLeft = tonerLeft;
    }

    public int getPaper() {
        return this.sheetsLeft;
    }

    public String print(int pages, int copies) {
        if (this.sheetsLeft >= (pages * copies)) {
            this.sheetsLeft -= (pages * copies);
            this.tonerLeft -= (pages * copies);
            return "The print has completed";
        } else {
            return "Not enough paper";

        }
    }
}
