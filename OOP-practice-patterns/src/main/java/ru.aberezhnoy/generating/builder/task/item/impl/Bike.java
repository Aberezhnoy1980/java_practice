package patterns.generating.builder.task.item.impl;

import patterns.generating.builder.task.item.Characteristic;
import patterns.generating.builder.task.item.Item;

public class Bike implements Item {
    private final Characteristic characteristic;

    public Bike(Characteristic characteristic) {
        this.characteristic = characteristic;
    }

    @Override
    public Characteristic getCharacteristic() {
        return characteristic;
    }
}
