import java.util.Objects;

public abstract class Student {

    protected String address;
    protected int identityCardNumber;

    public Student() {}

    public Student(String address, int identityCardNumber) {
        this.address = address;
        this.identityCardNumber = identityCardNumber;
    }

    public abstract void attendClass();

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

        Student student = (Student) o;

        if (identityCardNumber != student.identityCardNumber) return false;
        return Objects.equals(address, student.address);
    }

    @Override
    public int hashCode() {
        int result = address != null ? address.hashCode() : 0;
        result = 31 * result + identityCardNumber;
        return result;
    }
}
