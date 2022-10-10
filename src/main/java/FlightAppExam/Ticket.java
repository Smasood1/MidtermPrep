package FlightAppExam;

public abstract class Ticket implements Payable {
    private int id;
    private String origin;
    private String destination;
    private String seatNumber;
    private double price;

    public Ticket(int id, String origin, String destination, String seatNumber, double price) {
        this.id = id;
        this.origin = origin;
        this.destination = destination;
        this.seatNumber = seatNumber;
        this.price = price;


    }

    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", origin='" + origin + '\'' +
                ", destination='" + destination + '\'' +
                ", seatNumber='" + seatNumber + '\'' +
                ", price=" + price +
                '}';
    }

    public double getPrice() {
        return price;
    }
}
