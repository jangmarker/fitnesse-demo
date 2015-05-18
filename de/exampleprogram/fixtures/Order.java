package de.exampleprogram.fixtures;

import java.util.Vector;

public class Order {
    private Vector<String> items = new Vector<String>();

    public boolean orderItem(String item) {
        items.add(item);
        return true;
    }

    public boolean removeItem(String item) {
        return items.remove(item);
    }

    public boolean empty() {
        return items.isEmpty();
    }

    public int itemCount() {
        return items.size();
    }
}
