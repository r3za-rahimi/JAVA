import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class CsvToPerson {


    public static List<Person> persons;

    static {

        makePersons();

    }

    public CsvToPerson() {



    }

    private static void makePersons() {

        try (BufferedReader bf = new BufferedReader(new FileReader("churn.csv"));) {


            persons = bf.lines().skip(1).map(line -> {
                String[] sts = line.split(",");
                return new Person(Long.parseLong(sts[1].equals("") ? "0" : sts[1]), sts[2], Long.parseLong(sts[3].equals("") ? "0" : sts[3])
                        , sts[4], sts[5], Integer.parseInt(sts[6].equals("") ? "0" : sts[6]), Integer.parseInt(sts[7].equals("") ? "0" : sts[7]), Float.parseFloat(sts[9])
                        , Integer.parseInt(sts[10]), Objects.equals(sts[11], "1"), Objects.equals(sts[12], "1"), Float.parseFloat(sts[13]),
                        Objects.equals(sts[14], "1"), sts.length == 16 ? Long.parseLong(sts[15]) : 0);

            }).collect(Collectors.toList());


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
