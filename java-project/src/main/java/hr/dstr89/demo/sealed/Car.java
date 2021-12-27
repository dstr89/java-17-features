package hr.dstr89.demo.sealed;

public record Car(int numberOfSeats, String registrationNumber) implements Vehicle {}
