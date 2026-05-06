package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NameFormatterTest {

    @Test
    public void format_WaitingForFullNameSuffixAndPrefix_SettingAllNameFormat() {
        // Arrange
        String result = ("Rich,"+ " " + "Mr." + " " + "Raymond" + " " + "D," + " " + "PhD");

        // Act
        String testing = NameFormatter.format("Mr.", "Raymond", "D", "Rich", "PhD");

        // Assert
        assertEquals(result, testing);
    }

}