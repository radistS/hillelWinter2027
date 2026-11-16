package com.hillel.tests.collection;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CollectionTest {

    @Test
    void add() {
        Collection coll = new Collection();
        assertEquals(0, coll.size());
        assertTrue(coll.add("1"));
        assertEquals(1, coll.size());
        assertEquals("1", coll.get(0));
    }

    @Test
    void add_moreThanInitialCapacity() {
        Collection coll = new Collection();
        for (int i = 0; i < 15; i++) {
            assertTrue(coll.add(String.valueOf(i)));
        }
        assertEquals(15, coll.size());
        assertEquals("0", coll.get(0));
        assertEquals("14", coll.get(14));
    }

    @Test
    void testAdd() {
        Collection coll = new Collection();
        assertTrue(coll.add(0, "b"));      // into empty collection
        assertTrue(coll.add(0, "a"));      // to the beginning
        assertTrue(coll.add(2, "d"));      // to the end (index == size)
        assertTrue(coll.add(2, "c"));      // to the middle
        assertEquals(4, coll.size());
        assertEquals("a", coll.get(0));
        assertEquals("b", coll.get(1));
        assertEquals("c", coll.get(2));
        assertEquals("d", coll.get(3));
    }

    @Test
    void testAdd_invalidIndex() {
        Collection coll = new Collection();
        coll.add("1");
        assertFalse(coll.add(2, "x"));     // index > size
        assertFalse(coll.add(-1, "x"));    // index < 0
        assertEquals(1, coll.size());
    }

    @Test
    void testAdd_withResize() {
        Collection coll = new Collection();
        for (int i = 0; i < 10; i++) {
            coll.add(String.valueOf(i));
        }
        assertTrue(coll.add(5, "new"));
        assertEquals(11, coll.size());
        assertEquals("new", coll.get(5));
        assertEquals("5", coll.get(6));
        assertEquals("9", coll.get(10));
    }

    @Test
    void delete() {
        Collection coll = new Collection();
        assertTrue(coll.add("1"));
        assertTrue(coll.add("2"));
        assertTrue(coll.add("3"));
        assertEquals(3, coll.size());
        assertEquals(true, coll.delete("2"));
        assertEquals(2, coll.size());
        assertFalse( coll.contain("2"));
    }

    @Test
    void delete_notFound() {
        Collection coll = new Collection();
        assertFalse(coll.delete("1"));
        coll.add("1");
        assertFalse(coll.delete("2"));
        assertEquals(1, coll.size());
    }

    @Test
    void get() {
        Collection coll = new Collection();
        assertTrue(coll.add("1"));
        assertEquals("1", coll.get(0));

    }

    @Test
    void get_invalidIndex() {
        Collection coll = new Collection();
        coll.add("1");
        IndexOutOfBoundsException ex =
            assertThrows(IndexOutOfBoundsException.class, () -> coll.get(1));
        assertEquals("Index: 1, Size: 1", ex.getMessage());
        assertThrows(IndexOutOfBoundsException.class, () -> coll.get(-1));
    }

    @Test
    void contain() {
        Collection coll = new Collection();
        assertTrue(coll.add("1"));
        assertTrue(coll.add("2"));
        assertTrue(coll.contain("2"));
    }

    @Test
    void contain_notFound() {
        Collection coll = new Collection();
        assertFalse(coll.contain("1"));
        coll.add("1");
        assertFalse(coll.contain("2"));
    }

    @Test
    void testEquals() {
        Collection first = new Collection();
        Collection second = new Collection();
        assertTrue(first.equals(second));          // both empty

        first.add("1");
        first.add("2");
        second.add("1");
        second.add("2");
        assertTrue(first.equals(second));          // same elements
    }

    @Test
    void testEquals_null() {
        assertFalse(new Collection().equals(null));
    }

    @Test
    void testEquals_differentSize() {
        Collection first = new Collection();
        Collection second = new Collection();
        first.add("1");
        assertFalse(first.equals(second));
    }

    @Test
    void testEquals_differentElements() {
        Collection first = new Collection();
        Collection second = new Collection();
        first.add("1");
        first.add("2");
        second.add("1");
        second.add("3");
        assertFalse(first.equals(second));
    }

    @Test
    void clear() {
        Collection coll = new Collection();
        assertEquals(0, coll.size());
        assertTrue(coll.add("1"));
        assertEquals(1, coll.size());
        assertTrue(coll.clear());
        assertEquals(0, coll.size());
    }

    @Test
    void size() {
        Collection coll = new Collection();
        assertEquals(0, coll.size());
        assertTrue(coll.add("1"));
        assertEquals(1, coll.size());
    }
}
