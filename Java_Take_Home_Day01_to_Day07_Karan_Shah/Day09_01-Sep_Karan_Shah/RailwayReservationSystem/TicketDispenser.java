
public class TicketDispenser {
    private int ticketsAvailable = 100;
    private int allotedSeats=1;

    public synchronized String allotSeatNumber(int noOfSeats) {
        if ((noOfSeats + allotedSeats <= ticketsAvailable)) {
            String ans = "";
            System.out.println("Hi, " + noOfSeats + " Seats booked Successfully..");
            for (int i = allotedSeats; i < allotedSeats + noOfSeats; i++)
                ans += i + " ";
            allotedSeats = allotedSeats + noOfSeats;
            return ans;
        }
        return "Seats Not Available";
    }
}
