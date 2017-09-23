package invitations.controller;

import java.io.IOException;
import java.util.stream.IntStream;

import org.apache.commons.lang.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import invitations.model.Person;
import invitations.model.service.PersonService;

@Controller
@RequestMapping("/utils")
public class UtilsController {

	@Autowired
	PersonService personService;

	@RequestMapping(value = "/addperson/{count}", method = RequestMethod.GET)
	public void handleAddPerson(@PathVariable int count) throws IOException {

		IntStream.range(0, count).forEach(i -> {
			Person p = Person.builder()
					.name(RandomStringUtils.randomAlphabetic(10))
					.streetAddress(RandomStringUtils.randomAlphanumeric(30))
					.city(RandomStringUtils.randomAlphabetic(5))
					.mobilePhone(Long.parseLong(RandomStringUtils.randomNumeric(10)))
					.landline(Long.parseLong(RandomStringUtils.randomNumeric(10)))
					.pincode(Long.parseLong(RandomStringUtils.randomNumeric(10)))
					.email1(RandomStringUtils.randomAlphabetic(5))
					.email2(RandomStringUtils.randomAlphabetic(5))
					.build();

			personService.addPerson(p);

		});
	}
}
