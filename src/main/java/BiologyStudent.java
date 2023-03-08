public class BiologyStudent implements Citizen {

    private String address;
    private int identityCardNumber;

    public BiologyStudent() {
    }

    public BiologyStudent(String address, int identityCardNumber) {
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
}
