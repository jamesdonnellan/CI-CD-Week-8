package ie.atu.week5.lab5cicd;


@Component
public class DataLoader implements CommandLineRunner
{
    private final PersonRepository personRepository;

    public DataLoader(PersonRepository personRepository)
    {
        this.personRepository = personRepository;
    }

    @Override
    public void run(String... args) throws Exception
    {
        Address address1 = new Address("Galway", "F26E6P6");
        Person testData1 = new Person ("James", "Student", "1234", "james@atu.ie", "Software", address1);

        Address address2 = new Address("Galway", "H91H623");
        Person testData2 = new Person ("Jim", "Student", "1254", "jim@atu.ie", "Software", address2);

        Address address3 = new Address("Galway", "H32H123");
        Person testData3 = new Person ("Keelan", "Student", "3212", "Keelan@atu.ie", "Software", address3);

        personRepository.save(testData1);
        personRepository.save(testData2);
        personRepository.save(testData3);
    }
}
