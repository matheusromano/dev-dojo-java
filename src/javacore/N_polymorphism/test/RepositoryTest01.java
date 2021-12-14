package javacore.N_polymorphism.test;

import javacore.N_polymorphism.repository.Repository;
import javacore.N_polymorphism.service.DatabaseRepositoryService;
import javacore.N_polymorphism.service.FileRepositoryService;
import javacore.N_polymorphism.service.InMemoryRepositoryService;

public class RepositoryTest01 {
    public static void main(String[] args) {

        // the interface oriented pragramming says that from one interface we can use several services

        Repository repo = new DatabaseRepositoryService();
        repo.Save();

        Repository repo1 = new FileRepositoryService();
        repo1.Save();

        Repository repo2 = new InMemoryRepositoryService();
        repo2.Save();
    }
}
