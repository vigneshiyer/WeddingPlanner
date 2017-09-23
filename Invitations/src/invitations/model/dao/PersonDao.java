package invitations.model.dao;

import java.util.List;

import invitations.model.Guest;
import invitations.model.Person;

public interface PersonDao {
	void addPerson(Person p);
	Person getPerson(Long personId);
	void updatePerson(Person p);
	List<Person> getAllPersons(int startPage, int pageSize);
	List<Person> getAllPersons();
	void deletePerson(Long personId);
	List<Guest> getGuestsWithAccommodation(Long personId);
}
