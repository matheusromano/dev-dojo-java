package javacore.M_interfaces.domain;

// use the implements keyword to refer a interface
// all the 'terms' or method must be implements
// using the comma "," you be able to implements more than one interfaces *very important*
public class DataBase implements DataLoad, DataRemove {
    // interface security chain
    // private -> default -> protected -> public
    // override method always have to be more "public"
    @Override
    public void Load() {
        System.out.println("Loading data from database");
    }

    @Override
    public void Remove() {
        System.out.println("Removing data from database");
    }

    // but i can also override the default method for a specifc implementation

    @Override
    public void CheckVerification() {
        System.out.println("Checking the verification in database");
    }


    public static void RetreiveMaxDataSize() {
        System.out.println("inside the class database static method: " + MAX_DATA_SIZE);
    }
}
