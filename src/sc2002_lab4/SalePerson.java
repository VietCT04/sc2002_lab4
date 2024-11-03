package sc2002_lab4;

public class SalePerson implements Comparable<SalePerson> {
    private String firstName;
    private String lastName;
    private int totalSales;

    public SalePerson(String firstName, String lastName, int totalSales) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.totalSales = totalSales;
    }

    @Override
    public String toString() {
        return lastName + ", " + firstName + " : " + totalSales;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof SalePerson) {
            SalePerson other = (SalePerson) obj;
            return this.firstName.equals(other.firstName) && this.lastName.equals(other.lastName);
        }
        return false;
    }

    @Override
    public int compareTo(SalePerson other) {
        int salesComparison = Integer.compare(other.totalSales, this.totalSales);
        return salesComparison != 0 ? salesComparison : this.lastName.compareTo(other.lastName);
    }
}
