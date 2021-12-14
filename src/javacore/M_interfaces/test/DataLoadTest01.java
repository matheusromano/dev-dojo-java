package javacore.M_interfaces.test;

import javacore.M_interfaces.domain.DataBase;
import javacore.M_interfaces.domain.DataLoad;
import javacore.M_interfaces.domain.File;

public class DataLoadTest01 {
    public static void main(String[] args) {
        DataBase dataBase = new DataBase();
        File file = new File();

        dataBase.Load();
        file.Load();

        dataBase.Remove();
        file.Remove();

        dataBase.CheckVerification(); // Checking the verification in general
        file.CheckVerification(); // Checking the verification in general

        dataBase.CheckVerification(); // Checking the verification in database
        file.CheckVerification(); // Checking the verification in file

        // Because the method is static the call should be by the Class name not the reference object
        DataLoad.RetreiveMaxDataSize();
        DataBase.RetreiveMaxDataSize();


    }
}
