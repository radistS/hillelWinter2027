package com.hillel.tests.user;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

/**
 * Tests for package-private {@link UserValidator#valid(User)} method.
 */
class UserValidatorValidTest {

    private final UserValidator validator = new UserValidator();

    private User validUser() {
        return new User()
            .setName("Oleksandr")
            .setEmail("test@gmail.com")
            .setAge(18)
            .setPhone("+380501234567");
    }

    @Test
    void valid_noErrors() {
        assertDoesNotThrow(() -> validator.valid(validUser()));
    }

    @Test
    void valid_invalidEmail() {
        User user = validUser().setEmail("test.gmail.com");
        RuntimeException ex = assertThrows(RuntimeException.class, () -> validator.valid(user));
        assertEquals("[E001]", ex.getMessage());
    }

    @Test
    void valid_invalidAge() {
        User user = validUser().setAge(10);
        RuntimeException ex = assertThrows(RuntimeException.class, () -> validator.valid(user));
        assertEquals("[E002]", ex.getMessage());
    }

    @Test
    void valid_invalidPhone() {
        User user = validUser().setPhone("+48501234567");
        RuntimeException ex = assertThrows(RuntimeException.class, () -> validator.valid(user));
        assertEquals("[E003]", ex.getMessage());
    }

    @Test
    void valid_allErrors() {
        User user = new User()
            .setEmail("wrong")
            .setAge(5)
            .setPhone("123");
        RuntimeException ex = assertThrows(RuntimeException.class, () -> validator.valid(user));
        assertEquals("[E001, E002, E003]", ex.getMessage());
    }
}
