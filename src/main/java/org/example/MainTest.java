package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class MainTest {
    @Test
    public void testWorkintechList() {
        WorkintechList<String> list = new WorkintechList<>();
        list.add("Ali");
        list.add("Veli");
        list.add("Ahmet");
        list.add("Zeynep");

        list.sort();

        // Test for first and last elements after sorting
        assertEquals("Ahmet", list.getList().get(0));
        assertEquals("Zeynep", list.getList().get(list.size() - 1));

        // Test the internal list type
        assertEquals(true, list.getList() instanceof ArrayList);
    }
}
