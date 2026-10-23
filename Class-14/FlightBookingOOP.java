if (flight == null) {
            System.out.println("Booking failed: Flight code not found.");
            return;
        }

        System.out.print("Enter passenger name: ");
        String name = sc.nextLine().trim();

        if (name.isEmpty()) {
            System.out.println("Booking failed: Passenger name cannot be blank.");
            return;
        }

        System.out.print("Enter age: ");
        String ageInput = sc.nextLine().trim();
        int age;

        try {
            age = Integer.parseInt(ageInput);
        } catch (NumberFormatException e) {
            System.out.println("Booking failed: Age must be a whole number.");
            return;
        }

        if (age <= 0) {
            System.out.println("Booking failed: Age must be greater than zero.");
            return;
        }

        System.out.print("Passenger type (Regular/Student): ");
        String type = sc.nextLine().trim();

        Passenger passenger;
        if (type.equalsIgnoreCase("Regular")) {
            passenger = new RegularPassenger(name, age);
        } else if (type.equalsIgnoreCase("Student")) {
            passenger = new StudentPassenger(name, age);
        } else {
            System.out.println("Booking failed: Choose Regular or Student.");
            return;
        }

        System.out.print("Enter number of tickets: ");
        String ticketInput = sc.nextLine().trim();
        int tickets;

        try {
            tickets = Integer.parseInt(ticketInput);
        } catch (NumberFormatException e) {
            System.out.println("Booking failed: Ticket count must be a whole number.");
            return;
        }

        if (tickets <= 0) {
            System.out.println("Booking failed: Ticket count must be greater than zero.");
            return;
        }

        if (!flight.hasSeats(tickets)) {
            System.out.println("Booking failed: Not enough seats available.");
            System.out.println("Available seats remain unchanged: "
                    + flight.getAvailableSeats());
            return;
        }

        // Change seat count only after all validations pass.
        String bookingId = "BK" + nextBookingNumber;
        Booking booking = new Booking(bookingId, flight, passenger, tickets);
        flight.reserveSeats(tickets);
        latestBooking = booking;
        nextBookingNumber++;

        System.out.println("\nBooking confirmed!");
        booking.displaySummary();
        System.out.println("Remaining seats: " + flight.getAvailableSeats());
    }

    public void viewLatestBooking() {
        if (latestBooking == null) {
            System.out.println("No confirmed booking found.");
        } else {
            latestBooking.displaySummary();
        }
    }
}

public class FlightBookingOOP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FlightBookingSystem system = new FlightBookingSystem();

        while (true) {
            System.out.println("\n===== KIRAN AIR BOOKING =====");
            System.out.println("1. View Flights");
            System.out.println("2. Book Flight");
            System.out.println("3. View Booking");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            String input = sc.nextLine().trim();
            int choice;

            try {
                choice = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid choice! Enter a number from 1 to 4.");
                continue;
            }

            if (choice == 1) {
                system.displayFlights();
            } else if (choice == 2) {
                system.bookFlight(sc);
            } else if (choice == 3) {
                system.viewLatestBooking();
            } else if (choice == 4) {
                System.out.println("Thank you for using Kiran Air Booking!");
                break;
            } else {
                System.out.println("Invalid choice! Select 1, 2, 3, or 4.");
            }
        }

        sc.close();
    }
}
