package javacore.A_introductionclasses.test;

import javacore.A_introductionclasses.domain.Cars;

public class CarsTest01 {
    public static void main(String[] args) {
        Cars corsa = new Cars();
        corsa.name = "Corsa";
        corsa.model = "Wind";
        corsa.year = 2001;

        System.out.printf("First Car: \n Name: %s\n Year: %d\n Model: %s\n", corsa.name, corsa.year, corsa.model);

        System.out.println("-----------------------------");

        Cars saveiro = new Cars();
        saveiro.name = "Saveiro";
        saveiro.model = "Summer";
        saveiro.year = 1998;

        // transfer the reference of the object
        saveiro = corsa;

        System.out.printf("Second Car: \n Name: %s\n Year: %d\n Model: %s", saveiro.name, saveiro.year, saveiro.model);

    }
}
