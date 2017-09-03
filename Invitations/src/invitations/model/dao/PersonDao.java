package invitations.model.dao;

import java.util.List;

import invitations.model.Accommodation;
import invitations.model.Guest;
import invitations.model.Person;

public interface PersonDao {
	void addPerson(Person p);
	Person getPerson(Long personId);
	void updatePerson(Person p);
	List<Person> getAllPersons();
	void deletePerson(Long personId);
	void addGuest(Guest guest);
	void addAccommodation(Accommodation accommodation);
	Accommodation getAccommodation(Long personId);
	List<Guest> getGuests(Long personId);

}
