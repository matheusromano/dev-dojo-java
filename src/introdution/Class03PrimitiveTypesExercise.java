package introdution;

/**
 *  Create variables for the fields described below between <> and print the following message;
 *
 *  I <name> living at <address> confirm that i received the salary of <salary> on <date>
 */

public class Class03PrimitiveTypesExercise {
    public static void main(String[] args) {
        var name = "Matheus";
        var address = "451 East Side";
        var salary = 4541.20;
        // date received salary dd/MM/yyyy
        var salaryReceivedDate = "21/08/2021";
        var report = "I "+name+" living at "+address+" confirm that i received the salary of "+salary+" on "+ salaryReceivedDate;
        System.out.println(report);
    }
}
