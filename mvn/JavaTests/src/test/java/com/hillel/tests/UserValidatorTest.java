package com.hillel.tests;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import com.hillel.tests.user.User;
import com.hillel.tests.user.UserValidator;
import com.hillel.tests.user.exceptions.AgeException;
import com.hillel.tests.user.exceptions.EmailException;
import com.hillel.tests.user.exceptions.PhoneValidationException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

@DisplayName("User validator test")
class UserValidatorTest {

    private UserValidator validator;

    @BeforeEach
    void init() {
        validator = new UserValidator();
    }

    private User validUser() {
        return new User()
            .setName("Oleksandr")
            .setEmail("test@gmail.com")
            .setAge(18)
            .setPhone("+380501234567");
    }

    @Test
    void validate_validUser() {
        assertDoesNotThrow(() -> validator.validate(validUser()));
    }

    @Test
    void validate_invalidEmail() {
        User user = validUser().setEmail("test.gmail.com");
        EmailException ex = assertThrows(EmailException.class, () -> validator.validate(user));
        assertEquals("email not valid ...", ex.getMessage());
    }

    @Test
    void validate_invalidAge() {
        User user = validUser().setAge(17);
        AgeException ex = assertThrows(AgeException.class, () -> validator.validate(user));
        assertEquals("Age < 18, your age 17", ex.getMessage());
    }

    @ParameterizedTest
    @ValueSource(strings = {"0501234567", "+48501234567", "380501234567"})
    void validate_invalidPhone(String phone) {
        User user = validUser().setPhone(phone);
        PhoneValidationException ex =
            assertThrows(PhoneValidationException.class, () -> validator.validate(user));
        assertEquals("incorrect country phone prefix", ex.getMessage());
    }
}
