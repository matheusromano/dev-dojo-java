package javacore.K_enumeration.domain;

public enum CostumerType {
 //All the values here must to be final and constant
    INDIVIDUAL(1, "Individual"),
    START_UP(2, "Start-up"),
    COMPANY(3, "Company");

    // at this point we put other informations to the construtor
    public final int DB_VALUE;
    public String report;

    CostumerType(int DB_VALUE, String report) {
        this.DB_VALUE = DB_VALUE;
        this.report = report;
    }

    public static CostumerType getReportByName(String report) {
        for (CostumerType costumerType : values()) {
            if (costumerType.getReport().equalsIgnoreCase(report))
                return costumerType;
        }
        return null;
    }

    public String getReport() {
        return report;
    }

    public void setReport(String report) {
        this.report = report;
    }
}
