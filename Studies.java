public class Studies {
    private String name;
    private String description;
    private int numberOfSemesters;
    private int maxITNs;

    public Studies(String name, String description, int numberOfSemesters, int maxITNs) {
        this.name = name;
        this.description = description;
        this.numberOfSemesters = numberOfSemesters;
        this.maxITNs = maxITNs;
    }

    public int getNumberOfSemesters() {
        return numberOfSemesters;
    }
}
