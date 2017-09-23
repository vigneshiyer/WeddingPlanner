package invitations.model.impl;

import java.util.Collections;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import invitations.model.Guest;
import invitations.model.Person;
import invitations.model.dao.AbstractDao;
import invitations.model.dao.PersonDao;

@Repository
public class PersonDaoImpl extends AbstractDao<Integer, Person> implements PersonDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void addPerson(Person p) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		getSession().save(p);
		tx.commit();
		session.close();
	}

	@Override
	public Person getPerson(Long personId) {
		Session session = sessionFactory.getCurrentSession();
		Person person = session.get(Person.class, personId);
		return person;
	}

	@Override
	public void updatePerson(Person p) {
		Session session = sessionFactory.getCurrentSession();
		Person person = session.get(Person.class, p.getPersonId());
		person.setCity(p.getCity());
		person.setEmail1(p.getEmail1());
		person.setEmail2(p.getEmail2());
		person.setLandline(p.getLandline());
		person.setMobilePhone(p.getMobilePhone());
		person.setName(p.getName());
		person.setPincode(p.getPincode());
		person.setState(p.getState());
		person.setStreetAddress(p.getStreetAddress());
		session.save(person);
	}

	@Override
	public List<Person> getAllPersons(final int pageNum, final int pageSize) {
		Session session = sessionFactory.getCurrentSession();
		CriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaQuery<Person> query = builder.createQuery(Person.class);
		Root<Person> root = query.from(Person.class);
		query.select(root);
		Query<Person> q = session.createQuery(query);
		final int total = pageNum * pageSize;
		q.setFirstResult(total - pageSize);
		q.setMaxResults(pageSize);
		return q.getResultList();
	}

	@Override
	public List<Person> getAllPersons() {
		Session session = sessionFactory.getCurrentSession();
		CriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaQuery<Person> query = builder.createQuery(Person.class);
		Root<Person> root = query.from(Person.class);
		query.select(root);
		Query<Person> q = session.createQuery(query);
		return q.getResultList();
	}

	@Override
	public void deletePerson(Long personId) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.createQuery("delete from Guest where personId = :id").setParameter("id", personId).executeUpdate();
		session.createQuery("delete from Person where personId = :id").setParameter("id", personId).executeUpdate();
		tx.commit();
		session.close();
	}

	@Override
	public List<Guest> getGuestsWithAccommodation(Long personId) {
		Session session = sessionFactory.getCurrentSession();
		Person person = session.get(Person.class, personId);
		if (person == null) {
			return Collections.emptyList();
		}
		return person.getGuest();
	}
}
