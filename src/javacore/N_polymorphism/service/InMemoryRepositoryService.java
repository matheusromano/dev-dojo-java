package javacore.N_polymorphism.service;

import javacore.N_polymorphism.repository.Repository;

public class InMemoryRepositoryService implements Repository {
    @Override
    public void Save() {
        System.out.println("Saving the data in memory");
    }
}
