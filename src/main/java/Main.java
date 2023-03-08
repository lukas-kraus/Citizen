public class Main {

    public static void main(String[] args) {
        BiologyStudent personBio1 = new BiologyStudent("Milchstraße 123", 68213292);
        BiologyStudent personBio2 = new BiologyStudent("Musterstraße 22A", 38612381);

        ComputerScienceStudent personComputer1 = new ComputerScienceStudent("Mainzer Straße 2", 3249124, "macOS");
        ComputerScienceStudent personComputer2 = new ComputerScienceStudent("Weinstraße 42", 5222424, "Windows");

        System.out.println(personBio1); // BiologyStudent: Adresse Person 1
        System.out.println(personComputer2); // ComputerScieneStudent: Adresse Person 2

        Citizen testStudent = personBio1;
    }
}
