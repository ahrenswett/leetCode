package leetCode;

import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.Stack;

import static org.junit.Assert.*;

public class TicketPathTest {
    Stack<Ticket> stack;
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

    @Test
    public void ticketPathDecoder1() {
        stack = new Stack<>();
        stack.push(t1);
        stack.push(t2);
        stack.push(t3);
        stack.push(t4);
        stack.push(t5);
        stack.push(t6);
        stack.push(t7);
        stack.push(t8);
        stack.push(t9);
        stack.push(t10);
        stack.push(t11);
        assertEquals("van, ont, ind, sea, la, sl, el, dc, or, pr, vn, mars",TicketPath.ticketPathDecoder(stack));
    }
    @Test
    public void ticketPathDecoderV2() {
        stack = new Stack<>();
        stack.push(t1);
        stack.push(t2);
        stack.push(t3);
        stack.push(t4);
        stack.push(t10);
        assertEquals("sea, la, sl, el, dc, or",TicketPath.ticketPathDecoderV2(stack));
    }

    @Test
    public void ticketPathDecoderV2Test1() {
        stack = new Stack<>();
        stack.push(t1);
        stack.push(t2);
        stack.push(t3);
        stack.push(t4);
        stack.push(t5);
        stack.push(t6);
        stack.push(t7);
        stack.push(t8);
        stack.push(t9);
        stack.push(t10);
        stack.push(t11);
        assertEquals("van, ont, ind, sea, la, sl, el, dc, or, pr, vn, mars",TicketPath.ticketPathDecoderV2(stack));
    }
    @Test
    public void ticketPathDecoderV2Test2() {
        stack = new Stack<>();
        stack.push(t1);
        stack.push(t2);
        stack.push(t3);
        stack.push(t4);
        stack.push(t10);
        assertEquals("sea, la, sl, el, dc, or",TicketPath.ticketPathDecoderV2(stack));
    }
}