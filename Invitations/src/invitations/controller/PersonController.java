package invitations.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.core.JsonProcessingException;

import invitations.model.Person;
import invitations.model.service.PersonService;

@Controller
@RequestMapping("/invitations")
public class PersonController {

	@Autowired
	PersonService personService;

	@RequestMapping(value = "/addperson", method = RequestMethod.POST)
	public void handleAddPerson(@ModelAttribute("person") Person person, BindingResult result,
			HttpServletResponse response) throws IOException {
		personService.addPerson(person);
		response.sendRedirect("/ui/invitations/viewinvitees");
	}

	@RequestMapping(value = "/addPersonView", method = RequestMethod.GET)
	public String handleView(ModelMap model) {
		Person p = Person.builder().build();
		model.addAttribute("person", p);
		return "addPerson";
	}

	@RequestMapping(value = "/addGuestView/{id}", method = RequestMethod.GET)
	public String handleAddGuestView(@PathVariable long id, ModelMap model) {
		Person p = personService.getPerson(id);
		if (p == null) {
			p = Person.builder().build();
		}
		p.setGuests(personService.getGuestsWithAccommodation(id));
		model.addAttribute("person", p);
		return "viewAccompanyingGuests";
	}

	@RequestMapping(value="/edit/{id}", method=RequestMethod.GET)
	public String handle(@PathVariable long id, ModelMap model) {
		Person p = personService.getPerson(id);
		if (p == null) {
			return "home";
		}
		model.addAttribute("person", p);
		return "editPerson";
	}

	@RequestMapping(value="/update", method=RequestMethod.POST)
	public void handleUpdate(@ModelAttribute("person") Person p, BindingResult result, Model model,
			HttpServletResponse response) throws IOException {
		personService.upadatePerson(p);
		response.sendRedirect("/ui/invitations/viewinvitees");
	}

	@RequestMapping(value = "/getallpersons", method = RequestMethod.GET)
	@ResponseBody
	public List<Person> handle() throws JsonProcessingException {
		return personService.getAll();
	}

	@RequestMapping(value = "/viewinvitees", method = RequestMethod.GET)
	public String handleViewInvitees() {
		return "viewAllPersons";
	}

	@RequestMapping(value="/delete/{id}", method=RequestMethod.GET)
	public void handle(@PathVariable long id, HttpServletResponse response) throws IOException {
		personService.delete(id);
		response.sendRedirect("/ui/invitations/viewinvitees");
	}

	@RequestMapping(value="/getaccommodation/{id}", method=RequestMethod.GET)
	@ResponseBody
	public void getAccommodation(@PathVariable long id) throws IOException {
		personService.getPerson(id);
	}

	@RequestMapping(value="/viewpersonwithguests/{id}", method=RequestMethod.GET)
	public String getPersonWithGuests(@PathVariable long id, ModelMap model) throws IOException {
		Person p = personService.getPerson(id);
		if (p == null) {
			p = Person.builder().build();
		} else {
			p.setGuests(personService.getGuestsWithAccommodation(id));
		}
		model.addAttribute("person", p);
		return "guestView";
	}

}
