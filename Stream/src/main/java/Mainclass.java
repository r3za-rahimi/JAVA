import java.io.IOException;
import java.util.List;
import java.util.logging.XMLFormatter;
import java.util.stream.Collectors;

public class Mainclass {

    public static void main(String[] args) throws IOException {

//        CsvToPerson csv = new CsvToPerson();


        System.out.println("\u001B[31m" +"Q1");
//        CsvToPerson.persons.stream().sorted((x, y) -> (int) (y.getCreditScore() - x.getCreditScore())).findFirst().ifPresent(System.out::println);
        CsvToPerson.persons.stream().min((x, y) -> (int) (y.getCreditScore() - x.getCreditScore())).ifPresent(System.out::println);


        System.out.println("\u001B[32m" +"Q2");
        CsvToPerson.persons.stream().sorted((x, y) -> (int) (y.getCreditScore() - x.getCreditScore())).filter(Person::isExited).findFirst().ifPresent(System.out::println);

        System.out.println("\u001B[33m" +"Q3");
        System.out.println(CsvToPerson.persons.stream().filter(p -> p.getSurName().isEmpty() || p.getCustomerId() == 0).count());

        System.out.println("\u001B[34m" +"Q4");
        System.out.println(CsvToPerson.persons.stream().filter(p -> p.getGender().equals("Male") && p.getEstimatedSalary() < 60000).count());

        System.out.println("\u001B[35m"+ "Q5");
        List<Person> filterPsns = CsvToPerson.persons.stream()
                .filter(p -> p.getCustomerId() == 15717426 || p.getCustomerId() == 15585768 ||
                        p.getCustomerId() == 15619360 || p.getCustomerId() == 15738148 ||
                        p.getCustomerId() == 15687946).collect(Collectors.toList());


        System.out.println(filterPsns);


        System.out.println("\u001B[36m" +"Q6");
//        CsvToPerson.persons.stream().sorted((x, y) -> (int) (x.getCreditScore() - y.getCreditScore())).findFirst().ifPresent(System.out::println);
        CsvToPerson.persons.stream().min((x, y) -> (int) (x.getCreditScore() - y.getCreditScore())).ifPresent(System.out::println);


        System.out.println("\u001B[37m" +"Q7");
        CsvToPerson.persons.stream().sorted((x, y) -> (int) (x.getEstimatedSalary() - y.getEstimatedSalary())).limit(10).forEach(System.out::println);

        System.out.println("\u001B[35m" + "Q8");
        CsvToPerson.persons.stream().filter(p -> p.getGeography().equals("Spain")).mapToDouble(Person::getEstimatedSalary).average().ifPresent(System.out::println);


        System.out.println("\u001B[36m" +"Q9");
        System.out.println(CsvToPerson.persons.stream().filter(p -> p.getGeography().equals("Spain")).mapToLong(Person::getCurrentLoanAmount).sum());

        System.out.println("\u001B[34m" + "Q10");
       List<String> cities =  CsvToPerson.persons.stream().map(Person::getGeography).distinct().collect(Collectors.toList());
        System.out.println(cities);
    }

}
