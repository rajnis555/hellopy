package com.bookmyevents.ticketgenerator;

import java.util.Random;

public class TicketGenerator {
    private static final int MIN_TICKET_NUMBER = 1001;
    private static final int MAX_TICKET_NUMBER = 9999;

    public int generateTicketNumber() {
        Random random = new Random();
        // Generate a random number between MIN_TICKET_NUMBER and MAX_TICKET_NUMBER
        return random.nextInt((MAX_TICKET_NUMBER - MIN_TICKET_NUMBER) + 1) + MIN_TICKET_NUMBER;
    }

    public static void main(String[] args) {
        TicketGenerator ticketGenerator = new TicketGenerator();
        System.out.println("Generated Ticket Number: " + ticketGenerator.generateTicketNumber());
    }
}
