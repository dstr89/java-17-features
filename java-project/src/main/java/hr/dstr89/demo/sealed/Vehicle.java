package hr.dstr89.demo.sealed;

    public sealed interface Vehicle permits Car, Truck {

        String registrationNumber();

    }
