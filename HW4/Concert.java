
/*I worked on the homework assignment alone, using only course materials.*/
public class Concert {
    private double ticketPrice;
    private int capacity;
    private int ticketsSold;
    private String location;
    private String date;

    public double getTicketPrice() {
        return ticketPrice;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getTicketsSold() {
        return ticketsSold;
    }

    public String getLocation() {
        return location;
    }

    public String getDate() {
        return date;
    }

    //Setters for both location and ticketPrice
    public void setLocation(String location) {
        this.location = location;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public Concert(double ticketPrice, int capacity, String location, String date) {
        ticketsSold = 0;
        this.ticketPrice = ticketPrice;
        this.capacity = capacity;
        this.location = location;
        this.date = date;
    }

    public Concert(int capacity, String location, String date) {
        this(30, capacity, location, date);
        ticketsSold = 0;
    }

    //Using the capacity and ticketsSold fields, return whether or not this concert is sold out.
    public boolean isSoldOut() {
        if (capacity == ticketsSold) {
            return true;
        }
        return false;
    }

    public void sellTicket() {
        while (ticketsSold < capacity) {
            ++ticketsSold;
        }
    }

    public String toString() {
        String concertDescription = "A concert on " + date + " at " + location;
        return concertDescription;
    }

}
