import java.util.Objects;

public class ComputerScienceStudent extends Student implements Citizen {

    private String os;

    public ComputerScienceStudent() {
    }

    @Override
    public void attendClass() {

    }

    public ComputerScienceStudent(String address, int identityCardNumber, String os) {
        super(address, identityCardNumber);
        this.os = os;
    }

    public String getOs() {
        return os;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ComputerScienceStudent that = (ComputerScienceStudent) o;
        return Objects.equals(os, that.os);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), os);
    }

    public void setOs(String os) {
        this.os = os;
    }

    @Override
    public String toString() {
        return "ComputerScienceStudent{" +
                "os='" + os + '\'' +
                ", address='" + address + '\'' +
                ", identityCardNumber=" + identityCardNumber +
                "} " + super.toString();
    }
}
