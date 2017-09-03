package invitations.model.service;

import java.util.List;

import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import invitations.model.Accommodation;
import invitations.model.Guest;
import invitations.model.Person;
import invitations.model.dao.PersonDao;

@Service
@Transactional
public class PersonService {

	@Autowired
	private PersonDao dao;

	public void addPerson(Person p) {
		dao.addPerson(p);
	}

	public Person getPerson(Long personId) {
		return dao.getPerson(personId);
	}

	public void upadatePerson(Person p) {
		dao.updatePerson(p);
	}

	public List<Person> getAll() {
		return dao.getAllPersons();
	}

	public void delete(Long personId) {
		dao.deletePerson(personId);
	}

	public void addGuest(Guest guest) {
		dao.addGuest(guest);
	}

	public void addAccommodation(Accommodation accommodation) {
		dao.addAccommodation(accommodation);
	}

	public Accommodation getAccommodation(Long personId) {
		return dao.getAccommodation(personId);
	}

	public List<Guest> getGuests(Long personId) {
		Person p = dao.getPerson(personId);
		Hibernate.initialize(p.getGuests());
		return p.getGuests();
	}
}