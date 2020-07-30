package de.Jannik.SpringTest.DAO;

import de.Jannik.SpringTest.Model.Person;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
@Qualifier("fakeDAO")
public class FakePersonDataAccess implements PersonDAO{
    private static List<Person> DB =new ArrayList<>();
    @Override
    public int insertPerson(UUID id, Person person) {
        DB.add(new Person(id,person.getName()));
        return 1;
    }
}
