public class Main {

    public static void main(String[] args) {
        BiologyStudent personBio1 = new BiologyStudent("Milchstraße 123", 68213292);
        BiologyStudent personBio2 = new BiologyStudent("Musterstraße 22A", 38612381);

        ComputerScienceStudent personComputer1 = new ComputerScienceStudent("Mainzer Straße 2", 3249124);
        ComputerScienceStudent personComputer2 = new ComputerScienceStudent("Weinstraße 42", 5222424);

        System.out.println(personBio1.getAddress()); // Adresse Person 1 Bio
        System.out.println(personComputer2.getAddress()); // Adresse Person 2 Computer

        Citizen testStudent = personBio1;


    }
}
