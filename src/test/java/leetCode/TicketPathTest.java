package leetCode;

import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class TicketPathTest {
    Ticket t1 = new Ticket("sl", "el");
    Ticket t2 = new Ticket("la", "sl");
    Ticket t3 = new Ticket("dc", "or");
    Ticket t4 = new Ticket("sea", "la");
    Ticket t5 = new Ticket("van", "ont");
    Ticket t6 = new Ticket("vn", "mars");
    Ticket t7 = new Ticket("ind", "sea");
    Ticket t8 = new Ticket("or", "pr");
    Ticket t9 = new Ticket("ont", "ind");
    Ticket t10 = new Ticket("el", "dc");
    Ticket t11 = new Ticket("pr", "vn");

    List<Ticket> tickets = new ArrayList<>();
    Stack<Ticket> stack;

    private ArrayList<Ticket> ticketList() {
        tickets.add(t1);
        tickets.add(t2);
        tickets.add(t3);
        tickets.add(t4);
        tickets.add(t5);
        tickets.add(t6);
        tickets.add(t7);
        tickets.add(t8);
        tickets.add(t9);
        tickets.add(t10);
        tickets.add(t11);
        return (ArrayList<Ticket>) tickets;
    }


    private Stack rndmStackGen(List<Ticket> tickets) {
        stack = new Stack<>();
        tickets.clear();
        tickets = ticketList();
        Collections.shuffle(tickets);
        for (Ticket ticket : tickets) {
            System.out.println(ticket.depart + " to " + ticket.arrive);
            this.stack.push(ticket);
        }
        System.out.println();
        System.out.println("--------------NEW TEST---------------------");
        System.out.println();
        return this.stack;
    }

    @Test
    public void ticketPathDecoderTest1() {
        stack = rndmStackGen(tickets);
        assertEquals("van, ont, ind, sea, la, sl, el, dc, or, pr, vn, mars", TicketPath.ticketPathDecoder(stack));
        stack = rndmStackGen(tickets);
        assertEquals("van, ont, ind, sea, la, sl, el, dc, or, pr, vn, mars", TicketPath.ticketPathDecoder(stack));
        stack = rndmStackGen(tickets);
        assertEquals("van, ont, ind, sea, la, sl, el, dc, or, pr, vn, mars", TicketPath.ticketPathDecoder(stack));
        stack = rndmStackGen(tickets);
        assertEquals("van, ont, ind, sea, la, sl, el, dc, or, pr, vn, mars", TicketPath.ticketPathDecoder(stack));
        stack = rndmStackGen(tickets);
        assertEquals("van, ont, ind, sea, la, sl, el, dc, or, pr, vn, mars", TicketPath.ticketPathDecoder(stack));
        stack = rndmStackGen(tickets);
        assertEquals("van, ont, ind, sea, la, sl, el, dc, or, pr, vn, mars", TicketPath.ticketPathDecoder(stack));
        stack = rndmStackGen(tickets);
        assertEquals("van, ont, ind, sea, la, sl, el, dc, or, pr, vn, mars", TicketPath.ticketPathDecoder(stack));
        stack = rndmStackGen(tickets);
        assertEquals("van, ont, ind, sea, la, sl, el, dc, or, pr, vn, mars", TicketPath.ticketPathDecoder(stack));
        stack = rndmStackGen(tickets);
        assertEquals("van, ont, ind, sea, la, sl, el, dc, or, pr, vn, mars", TicketPath.ticketPathDecoder(stack));
        stack = rndmStackGen(tickets);
        assertEquals("van, ont, ind, sea, la, sl, el, dc, or, pr, vn, mars", TicketPath.ticketPathDecoder(stack));

    }

    @Test
    public void ticketPathDecoderV2Test2() {
        stack = rndmStackGen(tickets);
        assertEquals("van, ont, ind, sea, la, sl, el, dc, or, pr, vn, mars", TicketPath.ticketPathDecoder(stack));
        stack = rndmStackGen(tickets);
        assertEquals("van, ont, ind, sea, la, sl, el, dc, or, pr, vn, mars", TicketPath.ticketPathDecoder(stack));
        stack = rndmStackGen(tickets);
        assertEquals("van, ont, ind, sea, la, sl, el, dc, or, pr, vn, mars", TicketPath.ticketPathDecoder(stack));
        stack = rndmStackGen(tickets);
        assertEquals("van, ont, ind, sea, la, sl, el, dc, or, pr, vn, mars", TicketPath.ticketPathDecoder(stack));
        stack = rndmStackGen(tickets);
        assertEquals("van, ont, ind, sea, la, sl, el, dc, or, pr, vn, mars", TicketPath.ticketPathDecoder(stack));
        stack = rndmStackGen(tickets);
        assertEquals("van, ont, ind, sea, la, sl, el, dc, or, pr, vn, mars", TicketPath.ticketPathDecoder(stack));
        stack = rndmStackGen(tickets);
        assertEquals("van, ont, ind, sea, la, sl, el, dc, or, pr, vn, mars", TicketPath.ticketPathDecoder(stack));
        stack = rndmStackGen(tickets);
        assertEquals("van, ont, ind, sea, la, sl, el, dc, or, pr, vn, mars", TicketPath.ticketPathDecoder(stack));
        stack = rndmStackGen(tickets);
        assertEquals("van, ont, ind, sea, la, sl, el, dc, or, pr, vn, mars", TicketPath.ticketPathDecoder(stack));
        stack = rndmStackGen(tickets);
        assertEquals("van, ont, ind, sea, la, sl, el, dc, or, pr, vn, mars", TicketPath.ticketPathDecoder(stack));
    }
}