package s07;

public class DriverToPersonConverter implements Converter<Driver, Person> {

    @Override
    public Person conversion(Driver obj) {
        Person person = new Person();
        person.name = obj.getFirstName();
        person.surname = obj.getLastName();
        return person;
    }
}
