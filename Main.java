public class Main {
    public static void main(String[] args) {
        Person person;
            person = new Person(22, "bayekido", true);
        System.out.println(person.correct_name());

        CapitalizeDecorator capitalizedPerson = new CapitalizeDecorator(person);
        System.out.println(capitalizedPerson.correct_name());

        TrimmerDecorator capitalizedTrimmedPerson = new TrimmerDecorator(capitalizedPerson);
        System.out.println(capitalizedTrimmedPerson.correct_name());
    }
}