package com.pluralsight;

public class NameFormatter {
    private String firstName;
    private String lastName;
    private String middleName;
    private String prefix;
    private String suffix;

    private NameFormatter(String firstName, String lastName, String middleName, String prefix, String suffix) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.prefix = prefix;
        this.suffix = suffix;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getPrefix() {
        return prefix;
    }

    public String getSuffix() {
        return suffix;
    }

    public static String format (String firstName, String lastName) {
        return format("", firstName, "", lastName, "");
    }

    public static String format (String prefix, String firstName, String middleName, String lastName, String suffix) {
        String format = lastName;

        if (!prefix.isEmpty()) {
            format += ", " + prefix;
        }
        if (!firstName.isEmpty()) {
            format += " " + firstName;
        }
        if (!middleName.isEmpty()) {
            format += ", " + middleName;
        }
        if (!suffix.isEmpty()) {
            format += " " + suffix;
        }
        return format;
    }

    public static String format (String fullName) {
        return String.format(fullName);
    }
}
