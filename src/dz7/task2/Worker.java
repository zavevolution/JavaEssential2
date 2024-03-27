package dz7.task2;

public class Worker implements Comparable<Worker>{
    String name;
    String jobTitle;
    int yearOfEmployment;

    public Worker(String name, String jobTitle, int yearOfEmployment) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.yearOfEmployment = yearOfEmployment;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "прізвище='" + name + '\'' +
                ", посада='" + jobTitle + '\'' +
                ", рік надходження на роботу=" + yearOfEmployment +
                '}';
    }

    @Override
    public int compareTo(Worker o) {
        return this.name.compareTo(o.name);
    }
}
