import java.util.Objects;

public class BiologyStudent implements Citizen {

    private String address;
    private int identityCardNumber;

    public BiologyStudent() {
    }

    public BiologyStudent(String address, int identityCardNumber) {
        this.address = address;
        this.identityCardNumber = identityCardNumber;
    }

    @Override
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
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
        BiologyStudent that = (BiologyStudent) o;
        return identityCardNumber == that.identityCardNumber && Objects.equals(address, that.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(address, identityCardNumber);
    }

    @Override
    public String toString() {
        return "BiologyStudent{" +
                "address='" + address + '\'' +
                ", identityCardNumber=" + identityCardNumber +
                '}';
    }
}
