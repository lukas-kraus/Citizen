import java.util.Objects;

public class ComputerScienceStudent {

    private String address;
    private int identityCardNumber;

    public ComputerScienceStudent() {
    }

    public ComputerScienceStudent(String address, int identityCardNumber) {
        this.address = address;
        this.identityCardNumber = identityCardNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getIdentityCardNumber() {
        return identityCardNumber;
    }

    public void setIdentityCardNumber(int identityCardNumber) {
        this.identityCardNumber = identityCardNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ComputerScienceStudent that = (ComputerScienceStudent) o;
        return identityCardNumber == that.identityCardNumber && Objects.equals(address, that.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(address, identityCardNumber);
    }
}
