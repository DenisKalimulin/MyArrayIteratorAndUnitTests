package ru.sberSchool.itertor;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ArrayIteratorTest {
    private ArrayIterator<String> iteratoer;
    private String[] array;

    @BeforeEach
    void setUp() {
        array = new String[]{"a", "b", "c"};
        iteratoer = new ArrayIterator<>(array);
    }

    @Test
    void hasNextTest() {
        assertTrue(iteratoer.hasNext());
        iteratoer.next();
        assertTrue(iteratoer.hasNext());
        iteratoer.next();
        assertTrue(iteratoer.hasNext());
        iteratoer.next();
        assertFalse(iteratoer.hasNext());
    }

    @Test
    void nextTest() {
        iteratoer.next();
        iteratoer.next();
        iteratoer.next();

        assertThrows(NoSuchElementException.class, () -> {iteratoer.next();},
                "должен выбросить исключение NoSuchElementException," +
                        " когда не остается элементов");
    }
}
