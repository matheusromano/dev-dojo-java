package javacore.M_interfaces.domain;

public class File implements DataLoad, DataRemove {
    @Override
    public void Load() {
        System.out.println("Loading data from file");
    }

    @Override
    public void Remove() {
        System.out.println("Removing data from file");
    }

    @Override
    public void CheckVerification() {
        System.out.println("Checking the verification in file");
    }
}
