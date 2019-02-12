package com.challenges;

import org.junit.Test;

import static junit.framework.TestCase.*;

public class PersonTests {
    @Test
    public void isTeenTest() {
        Person person = new Person();
        person.setFirstName("Aaaa");
        person.setLastName("Bbbb");
        assertEquals("Aaaa Bbbb", person.getFullName());

        person.setAge(16);
        assertTrue(person.isTeen());

        person.setAge(12);
        assertFalse(person.isTeen());

        person.setAge(20);
        assertFalse(person.isTeen());

        person.setFirstName("");
        person.setLastName("Bbbb");
        assertEquals("Bbbb", person.getFullName());

        person.setFirstName("Aaaa");
        person.setLastName("");
        assertEquals("Aaaa", person.getFullName());

        person.setFirstName("");
        person.setLastName("");
        assertEquals("", person.getFullName());
    }
}
